import {Accounts} from './accounts';
import {ProductDto} from './product-dto';

export interface Cart {
  cartId?: number;
  quantity?: number;
  account?: Accounts;
  product?: ProductDto;
}
