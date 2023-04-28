package com.example.thy_thu_shop_back_end.controller;

import com.example.thy_thu_shop_back_end.model.Image;
import com.example.thy_thu_shop_back_end.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/images")
public class ImageRestController {
    @Autowired
    private IImageService imageService;

    @GetMapping()
    public ResponseEntity<List<Image>> findAll() {
        List<Image> imageList = imageService.findAll();
        if (imageList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(imageList, HttpStatus.OK);
    }
    @GetMapping("/{productId}")
    public ResponseEntity<List<Image>> findImageByProductId(@PathVariable Long productId) {
        List<Image> imageList = imageService.findImageByProductId(productId);
        if (imageList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(imageList, HttpStatus.OK);
    }

}
