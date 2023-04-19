import {Role} from "./role";
import {Account} from "./account";

export interface AccountRole {
  accountRoleId?: number;
  role?: Role;
  account?: Account;
}
