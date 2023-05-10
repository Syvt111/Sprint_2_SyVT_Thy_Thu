import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {OrderProduct} from '../model/order-product';
import {OrderDetail} from '../model/order-detail';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  private URL_API = 'http://localhost:8080/api/orders';

  constructor(private http: HttpClient) {
  }

  saveOrder(): Observable<any> {
    // @ts-ignore
    return this.http.post<any>(this.URL_API + '/save');
  }

  findOrderHistory(): Observable<OrderProduct[]> {
    return this.http.get<OrderProduct[]>(this.URL_API + '/history');
  }

  findOrderDetailByOrderId(orderId: number): Observable<OrderDetail[]> {
    return this.http.get<OrderDetail[]>(this.URL_API + '/detail/' + orderId);
  }

}
