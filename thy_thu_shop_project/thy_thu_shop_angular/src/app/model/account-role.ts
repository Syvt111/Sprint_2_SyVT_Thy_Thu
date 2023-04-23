import {Role} from './role';
import {Accounts} from './accounts';


export interface AccountRole {
  accountRoleId?: number;
  role?: Role;
  account?: Accounts;
}
