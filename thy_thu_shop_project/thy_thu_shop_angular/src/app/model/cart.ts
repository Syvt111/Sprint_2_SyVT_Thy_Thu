import {Product} from './product';
import {Accounts} from './accounts';

export interface Cart {
  cartId?: number;
  quantity?: number;
  account?: Accounts;
  product?: Product;
}
