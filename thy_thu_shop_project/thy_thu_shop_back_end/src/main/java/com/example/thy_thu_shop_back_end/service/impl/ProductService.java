package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.model.Product;
import com.example.thy_thu_shop_back_end.repository.IProductRepository;
import com.example.thy_thu_shop_back_end.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public Product findById(Long id) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void save(Product orderProduct) {

    }

    @Override
    public void delete(Long id) {

    }
}
