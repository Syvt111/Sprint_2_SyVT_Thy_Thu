import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {BehaviorSubject, Observable} from 'rxjs';
import {map, mergeAll, switchMap} from 'rxjs/operators';
import {Cart} from '../model/cart';
import {ProductService} from './product.service';
import {AccountService} from './account.service';
import {Router} from '@angular/router';
import {ImageService} from './image.service';

@Injectable({
  providedIn: 'root'
})
export class CartService {

  private URL_API = 'http://localhost:8080/api/carts';

  private totalQuantity = new BehaviorSubject<number>(0);
  private cartLength = new BehaviorSubject<number>(0);
  private quantityProductDetail = new BehaviorSubject<number>(0);
  private totalPrice = new BehaviorSubject<number>(0);
  private totalPriceAndShip = new BehaviorSubject<number>(0);
  private carts = new BehaviorSubject<Cart[]>(null);

  constructor(private http: HttpClient,
              private productService: ProductService,
              private accountService: AccountService,
              private router: Router,
              private imageService: ImageService) {
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

  addProductTooQuantityToCart(productId: number, username: string, updateQuantity: number) {
    const cartAdd: Cart = {
      cartId: null,
      account: null,
      product: null,
      quantity: updateQuantity
    };
    this.productService.findProductById(productId).subscribe(product => {
      this.findAllCartByUsername(username).subscribe(carts => {
        let count = 0;
        for (const cart of carts) {
          if (cart.product.productId === productId) {
            cart.quantity = updateQuantity;
            return this.updateCart(cart, cart.cartId).subscribe(() => {
              this.updateQuantityProductDetail(username, productId);
              this.updateCartsQuantity(username);
            });
          } else {
            count++;
          }
        }
        if (count === carts.length) {
          cartAdd.product = product;
          this.accountService.findAllCartByUsername(username).subscribe(account => {
            cartAdd.account = account;
          });
          return this.saveCart(cartAdd).subscribe(() => {
            this.updateQuantityProductDetail(username, productId);
            this.updateCartsQuantity(username);
          });
        }
      });
    });
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
        this.updateQuantityProductDetail(username, productId);
        this.updateCartsQuantity(username);
      });
    });
  }

  subProductFromCart(productId: number, username: string) {
    this.findAllCartByUsernameAndProductId(username, productId).subscribe(cart => {
      if (cart.quantity > 1) {
        cart.quantity = cart.quantity - 1;
        this.updateCart(cart, cart.cartId).subscribe(() => {
          this.updateQuantityProductDetail(username, productId);
          this.updateCartsQuantity(username);
        });
      } else if (cart.quantity === 1) {
        this.deleteCartById(cart.cartId).subscribe(() => {
          this.updateCartsQuantity(username);
          this.quantityProductDetail.next(0);

        });
      }
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

  updateCartsQuantity(username: string): void {
    let cartsUpdate;
    let cartLengthUpdate = 0;
    let totalQuantityUpdate = 0;
    let totalPriceUpdate = 0;
    let totalPriceAndShipUpdate = 0;
    this.findAllCartByUsername(username).subscribe(carts => {
      cartsUpdate = carts;
      cartLengthUpdate = carts.length;
      // cập nhật giá trị của carts
      for (const cart of carts) {
        totalQuantityUpdate += cart.quantity;
        totalPriceUpdate += (cart.quantity * cart.product.price);
        totalPriceAndShipUpdate = totalPriceUpdate + 20000;
        this.imageService.findImageByProductId(cart.product.productId).subscribe(images => {
          cart.product.images = images;
        });
      }
      this.carts.next(cartsUpdate);
      this.cartLength.next(cartLengthUpdate);
      this.totalQuantity.next(totalQuantityUpdate);
      this.totalPrice.next(totalPriceUpdate);
      this.totalPriceAndShip.next(totalPriceAndShipUpdate);

    });
  }

  getTotalQuantity$(): Observable<number> {
    return this.totalQuantity.asObservable();
  }

  getQuantityProductDetail(): Observable<number> {
    return this.quantityProductDetail.asObservable();
  }

  getCarts(): Observable<Cart[]> {
    return this.carts.asObservable();
  }

  getCartLength(): Observable<number> {
    return this.cartLength.asObservable();
  }

  getTotalPrice(): Observable<number> {
    return this.totalPrice.asObservable();
  }

  getTotalPriceAndShip(): Observable<number> {
    return this.totalPriceAndShip.asObservable();
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
  deleteCartByUsername(): Observable<Cart> {
    return this.http.delete<Cart>(this.URL_API + '/username');
  }
}
