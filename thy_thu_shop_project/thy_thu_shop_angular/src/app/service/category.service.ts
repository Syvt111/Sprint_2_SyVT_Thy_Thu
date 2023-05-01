import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Category} from '../model/category';

@Injectable({
  providedIn: 'root'
})
export class CategoryService {

  private URL_API = 'http://localhost:8080/api/categories';

  constructor(private http: HttpClient) {

  }

  findAllCategories(): Observable<Category[]> {
    return this.http.get<Category[]>(this.URL_API);
  }
}
