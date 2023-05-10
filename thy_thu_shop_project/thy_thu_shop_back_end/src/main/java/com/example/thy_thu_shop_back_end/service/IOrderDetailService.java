package com.example.thy_thu_shop_back_end.service;

import com.example.thy_thu_shop_back_end.model.Image;
import com.example.thy_thu_shop_back_end.model.OrderDetail;

import java.util.List;

public interface IOrderDetailService {
    OrderDetail findById(Long id);

    List<OrderDetail> findAll();
    List<OrderDetail> findOrderDetailByOrderId(Long id);
    void save(OrderDetail orderDetail);

    void delete(Long id);
    OrderDetail findNewOrderDetail();
}
