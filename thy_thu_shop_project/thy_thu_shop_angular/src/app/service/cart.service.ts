import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';
import {map, mergeAll, switchMap} from 'rxjs/operators';
import {Cart} from '../model/cart';
import {ProductService} from './product.service';
import {Product} from '../model/product';
import {AccountService} from './account.service';
import {Router} from '@angular/router';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  private URL_API = 'http://localhost:8080/api/carts';

  private totalQuantity = new BehaviorSubject<number>(0);
  private quantityProductDetail = new BehaviorSubject<number>(0);

  constructor(private http: HttpClient,
              private productService: ProductService,
              private accountService: AccountService,
              private router: Router) {
  }

  findAllCart(): Observable<Cart[]> {
    return this.http.get<Cart[]>(this.URL_API);
  }

  findAllCartByUsername(username: string): Observable<Cart[]> {
    return this.http.get<Cart[]>(this.URL_API + '/username' + '?username=' + username);
  }

  findAllCartByUsernameAndProductId(username: string, productId: number): Observable<Cart> {
    return this.http.get<Cart>(this.URL_API + '/username/' + productId + '?username=' + username);
  }

  addProductToCart(productId: number, username: string) {
    const cartAdd: Cart = {
      cartId: null,
      account: null,
      product: null,
      quantity: 1
    };
    this.productService.findProductById(productId).subscribe(product => {
      // Sử dụng pipe để xử lý các Observable đồng bộ
      this.findAllCartByUsername(username).pipe(
        map(carts => {
          let count = 0;
          for (const cart of carts) {
            if (cart.product.productId === productId) {
              cart.quantity = cart.quantity + 1;
              return this.updateCart(cart, cart.cartId);
            } else {
              count += 1;
            }
          }
          if (count === carts.length) {
            cartAdd.product = product;
            return this.accountService.findAllCartByUsername(username).pipe(
              switchMap(account => {
                cartAdd.account = account;
                return this.saveCart(cartAdd);
              })
            );
          }
        }),
        // bạn sử dụng mergeAll để hợp nhất các Observable trả về thành một Observable duy nhất
        mergeAll()
      ).subscribe(() => {
        this.updateTotalQuantity(username);
        this.updateQuantityProductDetail(username, productId);
      });
    });
  }

  subProductFromCart(productId: number, username: string) {
    this.findAllCartByUsernameAndProductId(username, productId).subscribe(cart => {
      if (cart.quantity > 1) {
        cart.quantity = cart.quantity - 1;
        this.updateCart(cart, cart.cartId).subscribe(() => {
          this.updateTotalQuantity(username);
          this.updateQuantityProductDetail(username, productId);
        });
      } else if (cart.quantity === 1) {
        this.deleteCartById(cart.cartId).subscribe(() => {
          this.updateTotalQuantity(username);
          this.quantityProductDetail.next(0);

        });
      }
    });
  }

  updateTotalQuantity(username: string): void {
    // tính tổng số lượng sản phẩm trong giỏ hàng
    let total = 0;
    this.findAllCartByUsername(username).subscribe(carts => {
      for (const cart of carts) {
        total += cart.quantity;
      }
      // cập nhật giá trị của totalQuantity
      this.totalQuantity.next(total);
    });
  }

  updateQuantityProductDetail(username: string, productId: number): void {
    // tính số lượng sản phẩm detail
    let quantity = 0;
    this.findAllCartByUsernameAndProductId(username, productId).subscribe(cart => {
      quantity = cart.quantity;
      // cập nhật giá trị của quantity
      this.quantityProductDetail.next(quantity);
    });
  }

  getTotalQuantity$(): Observable<number> {
    return this.totalQuantity.asObservable();
  }

  getQuantityProductDetail(): Observable<number> {
    return this.quantityProductDetail.asObservable();
  }

  saveCart(cart: Cart): Observable<Cart> {
    return this.http.post<Cart>(this.URL_API, cart);
  }

  updateCart(cart: Cart, cartId: number): Observable<Cart> {
    return this.http.put<Cart>(this.URL_API + '/' + cartId, cart);
  }

  deleteCartById(cartId: number): Observable<Cart> {
    return this.http.delete<Cart>(this.URL_API + '/' + cartId);
  }
}
