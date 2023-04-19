import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomePageComponent } from './component/home-page/home-page.component';
import { FooterComponent } from './component/footer/footer.component';
import { HeaderComponent } from './component/header/header.component';
import { ProductDetailComponent } from './component/product-detail/product-detail.component';
import { CartComponent } from './component/cart/cart.component';

@NgModule({
  declarations: [
    AppComponent,
    HomePageComponent,
    FooterComponent,
    HeaderComponent,
    ProductDetailComponent,
    CartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
