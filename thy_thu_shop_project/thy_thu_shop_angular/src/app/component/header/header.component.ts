import {Component, OnInit} from '@angular/core';
import {TokenStorageService} from '../security-authentication/service/token-storage.service';
import {ShareService} from '../security-authentication/service/share.service';
import {ActivatedRoute, Router} from '@angular/router';
import Swal from 'sweetalert2';
import {CartService} from '../../service/cart.service';
import {BehaviorSubject, Observable} from 'rxjs';
import {AccountService} from '../../service/account.service';
import {Accounts} from '../../model/accounts';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {
  isLoggedIn = false;
  username?: string;
  currentUser: string;
  accountName?: string;
  role?: string;
  totalQuantity$: Observable<number>;
  accounts: Accounts;

  constructor(private tokenStorageService: TokenStorageService,
              private shareService: ShareService,
              private router: Router,
              private cartService: CartService,
              private activatedRoute: ActivatedRoute,
              private accountService: AccountService) {
  }

  loadHeader(): void {
    if (this.tokenStorageService.getToken()) {
      this.currentUser = this.tokenStorageService.getUser().username;
      this.role = this.tokenStorageService.getUser().roles;
      console.log(this.role);
      this.username = this.tokenStorageService.getUser().username;
      this.cartService.updateCartsQuantity(this.username);
      this.totalQuantity$ = this.cartService.getTotalQuantity$();
        }
    this.isLoggedIn = this.username != null;
    this.getUsernameAccount();
    this.accountService.findAllCartByUsername(this.username).subscribe(account => {
      this.accounts = account;
    });
  }

  ngOnInit(): void {
    this.shareService.getClickEvent().subscribe(() => {
      this.loadHeader();

    });
    this.loadHeader();
  }

  async logOut() {
    this.tokenStorageService.signOut();
    this.shareService.sendClickEvent();
    await Swal.fire({
      text: 'Đăng xuất thành công',
      icon: 'success',
      showConfirmButton: false,
      timer: 1500
    });
    await this.router.navigateByUrl('/login');
    location.reload();
  }

  getUsernameAccount() {
    if (this.tokenStorageService.getToken()) {
      this.accountName = this.tokenStorageService.getUser().name;
    }
  }

  async logIn() {
    await this.router.navigateByUrl('/login');
    location.reload();
  }
}
