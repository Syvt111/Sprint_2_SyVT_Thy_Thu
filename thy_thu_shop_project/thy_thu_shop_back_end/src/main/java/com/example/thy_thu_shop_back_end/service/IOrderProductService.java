package com.example.thy_thu_shop_back_end.service;

import com.example.thy_thu_shop_back_end.model.OrderDetail;
import com.example.thy_thu_shop_back_end.model.OrderProduct;

import java.util.List;

public interface IOrderProductService {
    OrderProduct findById(Long id);

    List<OrderProduct> findAll();

    void save(OrderProduct orderProduct);

    void delete(Long id);
}
