import {Component, OnInit} from '@angular/core';
import {TokenStorageService} from '../security-authentication/service/token-storage.service';
import {CartService} from '../../service/cart.service';
import {Cart} from '../../model/cart';
import {ImageService} from '../../service/image.service';

@Component({
  selector: 'app-cart',
  templateUrl: './cart.component.html',
  styleUrls: ['./cart.component.css']
})
export class CartComponent implements OnInit {
  username: any;
  carts: Cart[];
  cartListLength: number;
  quantity = 0;

  constructor(private tokenStorageService: TokenStorageService,
              private cartService: CartService,
              private imageService: ImageService) {
  }

  ngOnInit(): void {
    this.username = this.tokenStorageService.getUser().username;
    this.cartService.findAllCartByUsername(this.username).subscribe(items => {
      this.carts = items;
      this.cartListLength = items.length;
      for (const cart of this.carts) {
        this.imageService.findImageByProductId(cart.product.productId).subscribe(images => {
          cart.product.images = images;
          this.quantity += cart.quantity;
        });
      }
    });
  }

}
