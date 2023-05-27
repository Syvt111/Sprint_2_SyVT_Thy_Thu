import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Product} from '../model/product';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private URL_API = 'http://localhost:8080/api/products';

  constructor(private http: HttpClient) {

  }

  findProductById(productId: number): Observable<Product> {
    return this.http.get<Product>(this.URL_API + '/' + productId);
  }

  findAllProduct(): Observable<Product[]> {
    return this.http.get<Product[]>(this.URL_API);
  }

  findAllAndSearch(categoryIdSearch: number, productNameSearch: string): Observable<Product[]> {
    return this.http.get<Product[]>(this.URL_API + '/product' + '?categoryIdSearch=' + categoryIdSearch +
      '&productNameSearch=' + productNameSearch);
  }

  addProduct(product: Product): Observable<Product> {
    return this.http.post<Product>(this.URL_API, product);
  }
}
