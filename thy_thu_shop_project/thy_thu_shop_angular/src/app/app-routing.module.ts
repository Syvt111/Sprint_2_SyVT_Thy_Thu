import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomePageComponent} from './component/home-page/home-page.component';
import {ProductDetailComponent} from './component/product-detail/product-detail.component';
import {CartComponent} from './component/cart/cart.component';
import {LoginComponent} from './component/security-authentication/login/login.component';


const routes: Routes = [
  {path: 'home', component: HomePageComponent},
  {path: 'product/detail', component: ProductDetailComponent},
  {path: 'product/cart', component: CartComponent},
  {path: 'login', component: LoginComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
