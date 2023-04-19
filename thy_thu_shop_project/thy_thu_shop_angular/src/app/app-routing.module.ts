import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomePageComponent} from "./component/home-page/home-page.component";
import {ProductDetailComponent} from "./component/product-detail/product-detail.component";
import {CartComponent} from "./component/cart/cart.component";

const routes: Routes = [{
  path: "",
  component: HomePageComponent
},
  {
    path: "product/detail",
    component: ProductDetailComponent
  },
  {
    path: "product/cart",
    component: CartComponent
  }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
