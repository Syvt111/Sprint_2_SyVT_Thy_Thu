import {Category} from './category';
import {Image} from './image';


export interface Product {
  productId?: number;
  productCode?: string;
  productName?: string;
  brand?: string;
  productSize?: string;
  price?: number;
  description?: string;
  flagDelete?: boolean;
  category?: Category;
  images?: Image[];

}
