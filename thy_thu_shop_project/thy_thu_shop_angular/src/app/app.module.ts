import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';

import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {RouterModule} from '@angular/router';
import {HomePageComponent} from './component/home-page/home-page.component';
import {HeaderComponent} from './component/header/header.component';
import {FooterComponent} from './component/footer/footer.component';
import {ProductDetailComponent} from './component/product-detail/product-detail.component';
import {CartComponent} from './component/cart/cart.component';
import {ChangePasswordComponent} from './component/security-authentication/change-password/change-password.component';
import {ForgotPasswordComponent} from './component/security-authentication/forgot-password/forgot-password.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HTTP_INTERCEPTORS, HttpClientModule} from '@angular/common/http';
import {AuthInterceptor} from './component/security-authentication/service-auth/auth.interceptor';
import {ProductListComponent} from './component/product-list/product-list.component';
import {LoginComponent} from './component/security-authentication/login/login.component';
import {PayPalComponent} from './component/pay-pal/pay-pal.component';
import {CommonModule} from '@angular/common';
import { OrderHistoryComponent } from './component/order-history/order-history.component';
import {NgxPaginationModule} from 'ngx-pagination';



@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    HeaderComponent,
    FooterComponent,
    ProductDetailComponent,
    CartComponent,
    ChangePasswordComponent,
    ForgotPasswordComponent,
    ProductListComponent,
    LoginComponent,
    PayPalComponent,
    OrderHistoryComponent,
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        RouterModule,
        ReactiveFormsModule,
        HttpClientModule,
        FormsModule,
        CommonModule,
        NgxPaginationModule
    ],
  providers: [{provide: HTTP_INTERCEPTORS, useClass: AuthInterceptor, multi: true}, Location],
  bootstrap: [AppComponent]
})
export class AppModule {
}
