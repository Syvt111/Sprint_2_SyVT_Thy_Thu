package com.example.thy_thu_shop_back_end.repository;

import com.example.thy_thu_shop_back_end.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Repository
@Transactional
public interface IImageRepository extends JpaRepository<Image,Integer> {

    @Query(value = "SELECT img.* FROM image as img", nativeQuery = true)
    List<Image> findAllImage();

}
