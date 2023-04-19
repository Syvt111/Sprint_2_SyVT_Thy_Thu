package com.example.thy_thu_shop_back_end.repository;

import com.example.thy_thu_shop_back_end.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOderDetailRepository extends JpaRepository<OrderDetail,Long> {

}
