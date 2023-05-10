package com.example.thy_thu_shop_back_end.controller;


import com.example.thy_thu_shop_back_end.model.Image;
import com.example.thy_thu_shop_back_end.model.Product;
import com.example.thy_thu_shop_back_end.service.IImageService;
import com.example.thy_thu_shop_back_end.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/products")
public class ProductRestController {
    @Autowired
    private IProductService productService;

    @GetMapping()
    public ResponseEntity<List<Product>> findAllProduct() {
        List<Product> productList = productService.findAll();
        if (productList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable Long id) {
        Product product = productService.findById(id);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(product, HttpStatus.OK);
    }

    @GetMapping("/product")
    public ResponseEntity<List<Product>> findProductAndSearchByNameAndCategory(@RequestParam(required = false, defaultValue = "") String productNameSearch,
                                                                               @RequestParam(defaultValue = "0") int categoryIdSearch) {
        List<Product> productList;
        if (categoryIdSearch == 0) {
            productList = productService.findAllSearchByNameAndSortList(productNameSearch);
        } else {
            productList = productService.findAllSearchAndSortList(categoryIdSearch, productNameSearch);
        }

        if (productList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

}
