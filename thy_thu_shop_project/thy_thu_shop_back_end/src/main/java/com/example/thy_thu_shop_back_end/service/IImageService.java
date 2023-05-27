package com.example.thy_thu_shop_back_end.service;

import com.example.thy_thu_shop_back_end.model.Category;
import com.example.thy_thu_shop_back_end.model.Image;

import java.util.List;
import java.util.Set;

public interface IImageService {
    Image findById(int id);

    List<Image> findAll();
    List<Image> findImageByProductId(Long productId);

    void save(Image image);

    void delete(int id);

    Set<Image> findSetImageByProductId(Long productId);
}
