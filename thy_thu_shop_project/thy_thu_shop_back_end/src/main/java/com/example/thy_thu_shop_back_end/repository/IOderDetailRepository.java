package com.example.thy_thu_shop_back_end.repository;

import com.example.thy_thu_shop_back_end.model.OrderDetail;
import com.example.thy_thu_shop_back_end.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IOderDetailRepository extends JpaRepository<OrderDetail, Long> {
    @Query(value = "SELECT od.* FROM order_detail as od ORDER BY od.order_detail_id DESC LIMIT 1", nativeQuery = true)
    OrderDetail findNewOrderDetail();

    @Query(value = "SELECT od.* FROM order_detail as od where order_id=:orderId", nativeQuery = true)
    List<OrderDetail> findOrderDetailByOrderId(@Param("orderId") Long orderId);

}
