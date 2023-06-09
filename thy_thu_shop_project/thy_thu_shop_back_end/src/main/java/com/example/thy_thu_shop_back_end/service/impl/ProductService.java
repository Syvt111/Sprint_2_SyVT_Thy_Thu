package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.dto.ProductDTO;
import com.example.thy_thu_shop_back_end.model.Image;
import com.example.thy_thu_shop_back_end.model.Product;
import com.example.thy_thu_shop_back_end.repository.IProductRepository;
import com.example.thy_thu_shop_back_end.service.IImageService;
import com.example.thy_thu_shop_back_end.service.IProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class ProductService implements IProductService {
    @Autowired
    private IImageService imageService;

    @Autowired
    private IProductRepository productRepository;

    @Override
    public Product findById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (optionalProduct.isPresent()) {
            return optionalProduct.get();
        } else {
            throw new ObjectNotFoundException("Product not found with id " + id);
        }
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
        productRepository.save(orderProduct);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public ProductDTO setProductDto(Product product) {
        List<Image> imageList = imageService.findImageByProductId(product.getProductId());
        ProductDTO productDTO = new ProductDTO();
        BeanUtils.copyProperties(product, productDTO);
        productDTO.setImageList(imageList);
        return productDTO;
    }

    @Transactional
    public Product addProductWithImages(Product product) {
        Product savedProduct = productRepository.save(product);
        Set<Image> imageSet = product.getImageSet();
        if (imageSet != null) {
            for (Image image : imageSet) {
                image.setProduct(savedProduct);
                imageService.save(image);
            }
        }
        return savedProduct;
    }
}
