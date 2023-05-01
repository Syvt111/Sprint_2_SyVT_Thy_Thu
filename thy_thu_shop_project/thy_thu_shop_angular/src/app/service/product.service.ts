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

  findAllProduct(): Observable<Product[]> {
    return this.http.get<Product[]>(this.URL_API);
  }

  findAllAndSearch(categoryIdSearch: number, productNameSearch: string): Observable<Product[]> {
    return this.http.get<Product[]>(this.URL_API + '/product' + '?categoryIdSearch=' + categoryIdSearch +
      '&productNameSearch=' + productNameSearch);
  }
}
