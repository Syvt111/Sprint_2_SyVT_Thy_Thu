import {Component, OnInit} from '@angular/core';
import {TokenStorageService} from '../security-authentication/service/token-storage.service';
import {CartService} from '../../service/cart.service';
import {Cart} from '../../model/cart';
import {ImageService} from '../../service/image.service';
import {Observable} from 'rxjs';
import {ShareService} from '../security-authentication/service/share.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  username: any;
  carts: Observable<Cart[]>;
  cartListLength: Observable<number>;
  totalPrice: Observable<number>;
  totalPriceAndShip: number;
  productId: number;
  ship: number;

  constructor(private tokenStorageService: TokenStorageService,
              private cartService: CartService,
              private imageService: ImageService,
              private shareService: ShareService) {
  }

  loadCart(): void {
    this.cartService.updateCartsQuantity(this.username);
    this.carts = this.cartService.getCarts();
    this.cartListLength = this.cartService.getCartLength();
    this.totalPrice = this.cartService.getTotalPrice();
  }

  ngOnInit(): void {
    this.username = this.tokenStorageService.getUser().username;
    this.loadCart();
    this.shareService.getClickEvent().subscribe(() => {
      this.loadCart();
    });
    this.totalPrice.subscribe(total => {
      if (total > 0) {
        this.ship = 20000;
        this.totalPriceAndShip = total + this.ship;
      } else if (total >= 10000000 && total === 0) {
        this.ship = 0;
        this.totalPriceAndShip = total + this.ship;
      }
    });
  }

  subProductFormCart(cart: Cart) {
    this.cartService.subProductFromCart(cart.product.productId, this.username);
  }

  addProductToCart(cart: Cart) {
    this.cartService.addProductToCart(cart.product.productId, this.username);

  }

  deleteProductFromCart(cart: Cart) {
    this.cartService.deleteCartById(cart.cartId).subscribe(() => {
      this.cartService.updateQuantityProductDetail(this.username, cart.product.productId);
      this.cartService.updateCartsQuantity(this.username);
    });
  }

  addToCartByQuantity(productId: number, quantityUpdate: string) {
    this.cartService.addProductTooQuantityToCart(productId, this.username, +quantityUpdate);
  }
}
