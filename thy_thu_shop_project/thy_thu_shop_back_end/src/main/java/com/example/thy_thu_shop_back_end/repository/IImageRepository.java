package com.example.thy_thu_shop_back_end.repository;

import com.example.thy_thu_shop_back_end.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Set;


@Repository
@Transactional
public interface IImageRepository extends JpaRepository<Image, Integer> {

    @Query(value = "SELECT img.* FROM image as img", nativeQuery = true)
    List<Image> findAllImage();

    @Query(value = "SELECT img.* FROM image as img where img.product_id =?1", nativeQuery = true)
    List<Image> findImageByProductId(Long productId);
    @Query(value = "SELECT img.* FROM image as img where img.product_id =?1", nativeQuery = true)
    Set<Image> findSetImageByProductId(Long productId);

}
