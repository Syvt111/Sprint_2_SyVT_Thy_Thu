package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.model.Image;
import com.example.thy_thu_shop_back_end.repository.IImageRepository;
import com.example.thy_thu_shop_back_end.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageService implements IImageService {
    @Autowired
    private IImageRepository iImageRepository;

    @Override
    public Image findById(int id) {
        return null;
    }

    @Override
    public List<Image> findAll() {
        return iImageRepository.findAllImage();
    }

    @Override
    public void save(Image image) {

    }

    @Override
    public void delete(int id) {

    }
}
