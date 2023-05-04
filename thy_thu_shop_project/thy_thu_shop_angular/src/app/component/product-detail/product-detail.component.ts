import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {ImageService} from '../../service/image.service';
import {ActivatedRoute} from '@angular/router';
import {TokenStorageService} from '../security-authentication/service/token-storage.service';
import {CartService} from '../../service/cart.service';
import {Cart} from '../../model/cart';
import {ShareService} from '../security-authentication/service/share.service';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css']
})
export class ProductDetailComponent implements OnInit {

  products ?: Product[] = [];
  productDetail?: Product;
  image?: string;
  productId?: number;
  currentSlideIndex = 0;
  imgStart?: string;
  username?: string;
  cartListLength: number;
  carts?: Cart[];
  quantityDetail: Observable<number>;
  quantityDetailPrice = 0 ;


  constructor(private productService: ProductService,
              private imageService: ImageService,
              private tokenStorageService: TokenStorageService,
              private cartService: CartService,
              private activatedRoute: ActivatedRoute,
              private shareService: ShareService
  ) {
    this.activatedRoute.paramMap.subscribe((paramMap) => {
      this.productId = +paramMap.get('productId');
      this.getProductDetail(this.productId);
    });
  }

  private loadProductDetail() {
    this.cartService.updateQuantityProductDetail(this.username, this.productId);
    this.quantityDetail = this.cartService.getQuantityProductDetail();
    console.log(this.quantityDetail);
  }

  ngOnInit(): void {
    this.getAllProduct();
    this.username = this.tokenStorageService.getUser().username;
    this.cartService.findAllCartByUsername(this.username).subscribe(items => {
      this.carts = items;
      this.cartListLength = items.length;
    });
    this.cartService.findAllCartByUsernameAndProductId(this.username, this.productId).subscribe(cart => {
      this.quantityDetailPrice = cart.quantity;
    });
    this.shareService.getClickEvent().subscribe(() => {
      this.loadProductDetail();

    });
    this.loadProductDetail();
  }

  private getAllProduct() {
    this.productService.findAllProduct().subscribe(items => {
        this.products = items;
        for (const product of this.products) {
          this.imageService.findImageByProductId(product.productId).subscribe(items2 => {
            product.images = items2;
            this.imgStart = this.productDetail.images[0].img;
          });
        }
      }
    );
  }

  nextSlide() {
    this.currentSlideIndex = Math.min(this.currentSlideIndex + 1, Math.ceil(this.products.length / 4) - 1);
  }

  prevSlide() {
    this.currentSlideIndex = Math.max(this.currentSlideIndex - 1, 0);
  }

  private getProductDetail(productId: number) {
    this.productService.findProductById(productId).subscribe(item => {
      this.productDetail = item;
      this.imageService.findImageByProductId(productId).subscribe(item2s => {
        this.productDetail.images = item2s;
      });
    });
  }

  selectImage(img: string) {
    this.imgStart = img;
  }

  addProductToCart(productId: number) {
    this.cartService.addProductToCart(productId, this.username);
  }

  addProductDetailToCart(productId: number) {
    this.cartService.addProductToCart(productId, this.username);
  }

  subProductDetailFormCart(productId: number) {
    this.cartService.subProductFromCart(productId, this.username);
  }


}
