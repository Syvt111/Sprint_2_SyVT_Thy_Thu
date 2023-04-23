import {Category} from './category';


export interface Product {
  productId?: number;
  productCode?: string;
  productName?: string;
  price?: number;
  description?: string;
  flagDelete?: boolean;
  category?: Category;

}
