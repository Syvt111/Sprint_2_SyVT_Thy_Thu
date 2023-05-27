package com.example.thy_thu_shop_back_end.service;

import com.example.thy_thu_shop_back_end.dto.ProductDTO;
import com.example.thy_thu_shop_back_end.model.OrderProduct;
import com.example.thy_thu_shop_back_end.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    Product findById(Long id);

    List<Product> findAll();
    Page<Product> findAllSearchAndSort(int categoryIdSearch, String productNameSearch, Pageable pageable);
    List<Product> findAllSearchAndSortList(int categoryIdSearch, String productNameSearch);
    List<Product> findAllSearchByNameAndSortList(String productNameSearch);
    void save(Product orderProduct);
    void delete(Long id);

    ProductDTO setProductDto(Product product);
    Product addProductWithImages(Product product);
}
