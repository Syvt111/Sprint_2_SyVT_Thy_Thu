import {Category} from './category';
import {Image} from './image';

export interface ProductDto {
  productId?: number;
  productName?: string;
  brand?: string;
  price?: number;
  description?: string;
  flagDelete?: boolean;
  category?: Category;
  images?: Image[];
}
