import {Injectable} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {Image} from "../model/image";

@Injectable({
  providedIn: 'root'
})
export class ImageService {
  private URL_API = 'http://localhost:8080/api/images';

  constructor(private http: HttpClient) {
  }

  findAllImage(): Observable<Image[]> {
    return this.http.get<Image[]>(this.URL_API)
  }

}
