import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ProductService} from '../../service/product.service';
import {ImageService} from '../../service/image.service';
import {Category} from '../../model/category';
import {CategoryService} from '../../service/category.service';
import {CartService} from '../../service/cart.service';
import {TokenStorageService} from '../security-authentication/service/token-storage.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './product-list.component.html',
  styleUrls: ['./product-list.component.css']
})
export class ProductListComponent implements OnInit {

  products ?: Product[] = [];
  image?: string;
  productId?: number;
  categoryId = 0;
  productNameSearch = '';
  categories ?: Category[] = [];
  flag?: boolean;
  username: string;

  constructor(private productService: ProductService,
              private categoryService: CategoryService,
              private imageService: ImageService,
              private cartService: CartService,
              private  tokenStorageService: TokenStorageService) {
  }

  ngOnInit(): void {
    this.getAllProduct(this.categoryId, this.productNameSearch);
    this.getAllCategory();
    this.username = this.tokenStorageService.getUser().username;
  }

  private getAllProduct(categoryId: number, productName: string) {
    this.productService.findAllAndSearch(categoryId, productName).subscribe(items => {
        this.products = items;
        this.flag = false;
        for (const product of this.products) {
          this.imageService.findImageByProductId(product.productId).subscribe(items2 => {
            product.images = items2;
          });
        }
      }, error => {
        this.flag = true;
        this.products = [];
      }
    );
  }

  searchProduct(categoryIdSearch: number, productNameSearch: string) {
    this.categoryId = categoryIdSearch;
    this.productNameSearch = productNameSearch;
    this.getAllProduct(this.categoryId, this.productNameSearch);

  }

  private getAllCategory() {
    this.categoryService.findAllCategories().subscribe(items => {
      this.categories = items;
    });
  }

  addProductToCart(productId: number) {
    this.cartService.addProductToCart(productId, this.username);
  }
}
