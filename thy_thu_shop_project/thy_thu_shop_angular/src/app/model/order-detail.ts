import {OrderProduct} from './order-product';
import {Product} from './product';


export interface OrderDetail {
  orderDetailId?: number;
  quantity?: number;
  order?: OrderProduct;
  product?: Product;

}
