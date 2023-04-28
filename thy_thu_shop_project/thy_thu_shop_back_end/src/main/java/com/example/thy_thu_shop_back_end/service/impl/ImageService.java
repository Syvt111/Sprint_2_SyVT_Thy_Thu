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
        return iImageRepository.findById(id).get();
    }

    @Override
    public List<Image> findAll() {
        return iImageRepository.findAllImage();
    }

    @Override
    public List<Image> findImageByProductId(Long productId) {
        return iImageRepository.findImageByProductId(productId);
    }

    @Override
    public void save(Image image) {
        iImageRepository.save(image);
    }

    @Override
    public void delete(int id) {
        iImageRepository.deleteById(id);
    }
}
