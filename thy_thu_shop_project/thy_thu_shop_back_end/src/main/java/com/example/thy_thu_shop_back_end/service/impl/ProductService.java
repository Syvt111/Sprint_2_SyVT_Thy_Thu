package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.model.Product;
import com.example.thy_thu_shop_back_end.repository.IProductRepository;
import com.example.thy_thu_shop_back_end.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public Page<Product> findAllSearchAndSort(int categoryIdSearch, String productNameSearch, Pageable pageable) {
        return productRepository.findProductByCategoryIdAndProductNamePage(categoryIdSearch, productNameSearch, pageable);
    }

    @Override
    public List<Product> findAllSearchAndSortList(int categoryIdSearch, String productNameSearch) {
        return productRepository.findProductByCategoryIdAndProductNameList(categoryIdSearch, productNameSearch);
    }

    @Override
    public List<Product> findAllSearchByNameAndSortList(String productNameSearch) {
        return productRepository.findProductByProductNameList(productNameSearch);
    }

    @Override
    public void save(Product orderProduct) {

    }

    @Override
    public void delete(Long id) {

    }
}
