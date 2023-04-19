package com.example.thy_thu_shop_back_end.repository;

import com.example.thy_thu_shop_back_end.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IProductRepository extends JpaRepository<Product,Long> {

    @Query(value = "SELECT p.* FROM product as p", nativeQuery = true)
    List<Product> findAllProduct();

}
