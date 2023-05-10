import {Component, OnInit} from '@angular/core';
import {Observable} from 'rxjs';
import {Cart} from '../../model/cart';
import {CartService} from '../../service/cart.service';
import {OrderService} from '../../service/order.service';
import {OrderProduct} from '../../model/order-product';
import {OrderDetail} from '../../model/order-detail';
import {ActivatedRoute} from '@angular/router';
import {ImageService} from '../../service/image.service';
import { Location } from '@angular/common';

@Component({
  selector: 'app-order-history',
  templateUrl: './order-history.component.html',
  styleUrls: ['./order-history.component.css']
})
export class OrderHistoryComponent implements OnInit {
  carts: Observable<Cart[]>;
  orders: OrderProduct[];
  orderDetails: OrderDetail[];
  orderId: number;
  showDetail = false;
  orderCode: string;
  imgStart?: string;
  page = 0;

  constructor(private cartService: CartService,
              private orderService: OrderService,
              private activatedRoute: ActivatedRoute,
              private imageService: ImageService,
              private location: Location
  ) {
  }

  ngOnInit(): void {
    this.carts = this.cartService.getCarts();
    this.orderService.findOrderHistory().subscribe(items => {
      this.orders = items;
    });

  }

  showOrderDetail(order: OrderProduct) {
    this.orderCode = 'ORD' + order.orderId;
    this.showDetail = true;
    this.orderService.findOrderDetailByOrderId(order.orderId).subscribe(items => {
      this.orderDetails = items;
      for (const orderDetail of items) {
        this.imageService.findImageByProductId(orderDetail.product.productId).subscribe(images => {
          orderDetail.product.images = images;
          this.imgStart = orderDetail.product.images[0].img;
        });
      }

    });
  }

  goToBack() {
    this.location.back();
  }
}
