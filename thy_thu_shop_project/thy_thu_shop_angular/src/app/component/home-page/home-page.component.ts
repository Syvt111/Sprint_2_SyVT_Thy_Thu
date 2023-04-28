import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {ImageService} from '../../service/image.service';

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {
  products ?: Product[] = [];
  image?: string;
  productId?: number;

  constructor(private productService: ProductService,
              private imageService: ImageService) {
  }

  ngOnInit(): void {
    this.getAllProduct();
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
}
