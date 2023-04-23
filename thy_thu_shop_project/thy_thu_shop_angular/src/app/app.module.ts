import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import {RouterModule} from '@angular/router';
import { HomePageComponent } from './component/home-page/home-page.component';
import { HeaderComponent } from './component/header/header.component';
import { FooterComponent } from './component/footer/footer.component';
import { ProductDetailComponent } from './component/product-detail/product-detail.component';
import { CartComponent } from './component/cart/cart.component';
import { LoginComponent } from './component/login/login.component';
import { ChangePasswordComponent } from './component/security-authentication/change-password/change-password.component';
import { ForgotPassworkComponent } from './component/security-authentication/forgot-passwork/forgot-passwork.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    HomePageComponent,
    HeaderComponent,
    FooterComponent,
    ProductDetailComponent,
    CartComponent,
    LoginComponent,
    ChangePasswordComponent,
    ForgotPassworkComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
