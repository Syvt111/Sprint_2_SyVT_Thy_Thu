package com.example.thy_thu_shop_back_end.repository;

import com.example.thy_thu_shop_back_end.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IProductRepository extends JpaRepository<Product, Long> {

    @Query(value = "SELECT p.* FROM product as p", nativeQuery = true)
    List<Product> findAllProduct();

    @Query(value = "SELECT pr.* FROM `product` as pr WHERE pr.category_id =:categoryIdSearch and pr.product_name like CONCAT('%',:productNameSearch,'%') ORDER BY product_id DESC", nativeQuery = true)
    Page<Product> findProductByCategoryIdAndProductNamePage(@Param("categoryIdSearch") int categoryIdSearch, @Param("productNameSearch") String productNameSearch, Pageable pageable);

    @Query(value = "SELECT pr.* FROM `product` as pr WHERE pr.category_id =:categoryIdSearch and pr.product_name like CONCAT('%',:productNameSearch,'%') ORDER BY product_id DESC", nativeQuery = true)
    List<Product> findProductByCategoryIdAndProductNameList(@Param("categoryIdSearch") int categoryIdSearch, @Param("productNameSearch") String productNameSearch);


    @Query(value = "SELECT pr.* FROM `product` as pr WHERE pr.product_name like CONCAT('%',:productNameSearch,'%') ORDER BY product_id DESC", nativeQuery = true)
    List<Product> findProductByProductNameList(@Param("productNameSearch") String productNameSearch);

}
