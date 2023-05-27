import {Accounts} from './accounts';

export interface OrderProduct {
  orderId?: number;
  timeOrder?: string;
  totalPrice?: number;
  account?: Accounts;
}
