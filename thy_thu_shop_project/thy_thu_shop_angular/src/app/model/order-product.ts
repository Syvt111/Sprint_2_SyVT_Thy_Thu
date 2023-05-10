import {Accounts} from './accounts';

export interface OrderProduct {
  orderId?: number;
  codeOrder?: string;
  timeOrder?: string;
  totalPrice?: number;
  account?: Accounts;
}
