import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {HomePageComponent} from './component/home-page/home-page.component';
import {ProductDetailComponent} from './component/product-detail/product-detail.component';
import {CartComponent} from './component/cart/cart.component';
import {LoginComponent} from './component/security-authentication/login/login.component';
import {ProductListComponent} from './component/product-list/product-list.component';
import {PayPalComponent} from './component/pay-pal/pay-pal.component';
import {OrderHistoryComponent} from './component/order-history/order-history.component';
import {ErrorComponent} from './component/error/error.component';
import {ProductCreateComponent} from './component/product-create/product-create.component';


const routes: Routes = [
  {path: 'home', component: HomePageComponent},
  {path: 'product/detail/:productId', component: ProductDetailComponent},
  {path: 'product/list', component: ProductListComponent},
  {path: 'product/cart', component: CartComponent},
  {path: 'product/add', component: ProductCreateComponent},
  {path: 'login', component: LoginComponent},
  {path: 'paypal', component: PayPalComponent},
  {path: 'order/history', component: OrderHistoryComponent},
  {path: '**', component: ErrorComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
