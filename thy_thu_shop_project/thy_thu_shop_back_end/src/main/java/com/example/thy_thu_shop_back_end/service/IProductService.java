package com.example.thy_thu_shop_back_end.service;

import com.example.thy_thu_shop_back_end.model.OrderProduct;
import com.example.thy_thu_shop_back_end.model.Product;

import java.util.List;

public interface IProductService {
    Product findById(Long id);

    List<Product> findAll();

    void save(Product orderProduct);

    void delete(Long id);
}
