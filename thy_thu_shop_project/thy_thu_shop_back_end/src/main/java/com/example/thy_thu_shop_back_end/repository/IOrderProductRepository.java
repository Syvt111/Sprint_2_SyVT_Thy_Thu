package com.example.thy_thu_shop_back_end.repository;

import com.example.thy_thu_shop_back_end.model.Account;
import com.example.thy_thu_shop_back_end.model.Cart;
import com.example.thy_thu_shop_back_end.model.OrderProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOrderProductRepository extends JpaRepository<OrderProduct, Long> {
    @Query(value = "SELECT ord.* FROM order_product ord join account ac on ord.account_id = ac.account_id WHERE ac.username =:username order by time_order desc", nativeQuery = true)
    List<OrderProduct> findOrderByAccountUsername(String username);
}
