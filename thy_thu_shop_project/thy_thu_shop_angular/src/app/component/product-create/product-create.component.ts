import {Component, OnInit} from '@angular/core';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';
import {Image} from '../../model/image';
import {Location} from '@angular/common';

class Images {
}

@Component({
  selector: 'app-product-create',
  templateUrl: './product-create.component.html',
  styleUrls: ['./product-create.component.css']
})
export class ProductCreateComponent implements OnInit {

  product: Product;
  images: Image[] = [];

  constructor(private productService: ProductService,
              private location: Location) {
  }

  ngOnInit(): void {
  }

  addProductWithImages() {
    this.product.images = this.images;

    this.productService.addProduct(this.product).subscribe(
      response => {
        console.log('Sản phẩm đã được thêm thành công', response);
        // Xử lý thành công, ví dụ như chuyển hướng đến trang sản phẩm đã được thêm
      },
      error => {
        console.error('Lỗi khi thêm sản phẩm', error);
        // Xử lý lỗi, ví dụ như hiển thị thông báo lỗi cho người dùng
      }
    );
  }

  addImage() {
    // @ts-ignore
    const newImage = new Image();
    // @ts-ignore
    this.images.push(newImage);
  }

  removeImage(index: number) {
    this.images.splice(index, 1);
  }

  handleFileInput(event: any) {
    const fileList: FileList = event.target.files;
    // tslint:disable-next-line:prefer-for-of
    for (let i = 0; i < fileList.length; i++) {
      // @ts-ignore
      const newImage = new Image();
      newImage.name = fileList[i].name;
      // @ts-ignore
      this.images.push(newImage);
    }
  }

  goToBack() {
    this.location.back();
  }
}
