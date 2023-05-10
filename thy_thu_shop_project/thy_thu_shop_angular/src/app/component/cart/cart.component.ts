import {AfterViewInit, Component, ElementRef, OnInit, Renderer2, ViewChild} from '@angular/core';
import {TokenStorageService} from '../security-authentication/service/token-storage.service';
import {CartService} from '../../service/cart.service';
import {Cart} from '../../model/cart';
import {ImageService} from '../../service/image.service';
import {Observable} from 'rxjs';
import {ShareService} from '../security-authentication/service/share.service';
import {render} from 'creditcardpayments/creditCardPayments';

import {Router} from '@angular/router';
import {ViewportScroller} from '@angular/common';
import {OrderService} from '../../service/order.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit, AfterViewInit {
  username: any;
  carts: Observable<Cart[]>;
  cartListLength: Observable<number>;
  totalPrice: Observable<number>;
  totalPriceAndShip: Observable<number>;
  productId: number;
  ship: number;
  private rendered = false;
  checkOutFlag: boolean;
  countCheckOut = 0;
  paypalHtml: string;

  constructor(private tokenStorageService: TokenStorageService,
              private cartService: CartService,
              private imageService: ImageService,
              private shareService: ShareService,
              private router: Router,
              private renderer2: Renderer2,
              private viewportScroller: ViewportScroller,
              private orderService: OrderService
  ) {
    this.viewportScroller.scrollToPosition([0, 0]);
  }

  loadCart(): void {
    this.carts = this.cartService.getCarts();
    this.cartListLength = this.cartService.getCartLength();
    this.totalPrice = this.cartService.getTotalPrice();
    this.totalPriceAndShip = this.cartService.getTotalPriceAndShip();
  }

  ngAfterViewInit(): void {
    this.viewportScroller.scrollToPosition([0, 0]);
  }

  ngOnInit(): void {
    this.username = this.tokenStorageService.getUser().username;
    this.loadCart();
    this.shareService.getClickEvent().subscribe(() => {
      this.loadCart();
    });
    this.cartService.getTotalPriceAndShip().subscribe(total => {
      if (total > 0) {
        this.ship = 20000;
      } else if (total >= 10000000 && total === 0) {
        this.ship = 0;
      }
      if (typeof total !== 'number' || isNaN(total) || total <= 0) {
        return;
      }
      const amountPayUSD = total / 23000;
      if (this.cartService.getTotalPriceAndShip() && amountPayUSD) {
        document.querySelector('#myPaypalButtons').innerHTML = '';
        render(
          {
            id: '#myPaypalButtons',
            currency: 'VND',
            value: (amountPayUSD).toFixed(2),
            onApprove: (details => {
              this.orderService.saveOrder().subscribe(() => {
              });
              this.cartService.deleteCartByUsername().subscribe();
              Swal.fire({
                text: 'Thanh toán thành công !',
                icon: 'success',
                confirmButtonText: 'OK'
              });
              this.cartService.updateCartsQuantity(this.username);
            })
          });
      }
    });
    this.view();

  }


  view(): void {

    const element = document.getElementById('myPaypal');
    if (element) {
      element.scrollIntoView();
    }
  }

  subProductFormCart(cart: Cart) {
    this.checkOutFlag = false;
    this.countCheckOut = 0;
    this.cartService.subProductFromCart(cart.product.productId, this.username);
  }

  addProductToCart(cart: Cart) {
    this.checkOutFlag = false;
    this.countCheckOut = 0;
    this.cartService.addProductToCart(cart.product.productId, this.username);

  }

  deleteProductFromCart(cart: Cart) {
    this.checkOutFlag = false;
    this.cartService.deleteCartById(cart.cartId).subscribe(() => {
      this.cartService.updateQuantityProductDetail(this.username, cart.product.productId);
      this.cartService.updateCartsQuantity(this.username);
      this.countCheckOut = 0;

    });
  }

  addToCartByQuantity(productId: number, quantityUpdate: string) {
    this.cartService.addProductTooQuantityToCart(productId, this.username, +quantityUpdate);
    this.checkOutFlag = false;
    this.countCheckOut = 0;
  }

  toPay() {
    this.countCheckOut++;
    if (this.countCheckOut % 2 !== 0) {
      this.checkOutFlag = true;
    }
  }


}
