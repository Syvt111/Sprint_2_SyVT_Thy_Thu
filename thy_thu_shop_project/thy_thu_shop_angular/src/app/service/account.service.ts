import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {ProductService} from './product.service';
import {Observable} from 'rxjs';
import {Cart} from '../model/cart';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  private URL_API = 'http://localhost:8080/api/accounts';

  constructor(private http: HttpClient,
  ) {
  }

  findAllCartByUsername(username: string): Observable<Account> {
    return this.http.get<Account>(this.URL_API + '/username' + '?username=' + username);
  }

}
