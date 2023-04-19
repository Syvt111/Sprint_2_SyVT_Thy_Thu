package com.example.thy_thu_shop_back_end.controller;


import com.example.thy_thu_shop_back_end.model.Image;
import com.example.thy_thu_shop_back_end.model.Product;
import com.example.thy_thu_shop_back_end.service.IImageService;
import com.example.thy_thu_shop_back_end.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/products")
public class ProductRestController {
    @Autowired
    private IProductService productService;

    @GetMapping()
    public ResponseEntity<List<Product>> findAllProgressReport() {
        List<Product> productList = productService.findAll();
        if (productList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(productList, HttpStatus.OK);
    }

}
