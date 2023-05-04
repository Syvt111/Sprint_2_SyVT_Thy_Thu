import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {ImageService} from '../../service/image.service';
import {TokenStorageService} from '../security-authentication/service/token-storage.service';
import {CartService} from '../../service/cart.service';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {
  products ?: Product[] = [];
  image?: string;
  productId?: number;
  username: string;

  constructor(private productService: ProductService,
              private imageService: ImageService,
              private tokenStorageService: TokenStorageService,
              private cartService: CartService) {
  }

  ngOnInit(): void {
    this.getAllProduct();
    this.username = this.tokenStorageService.getUser().username;
  }

  private getAllProduct() {
    this.productService.findAllProduct().subscribe(items => {
        this.products = items;
        for (const product of this.products) {
          this.imageService.findImageByProductId(product.productId).subscribe(items2 => {
            product.images = items2;
          });
        }
      }
    );
  }

  addProductToCart(productId: number) {
    this.cartService.addProductToCart(productId, this.username);
  }
}
