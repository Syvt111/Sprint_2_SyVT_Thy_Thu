package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.model.OrderDetail;
import com.example.thy_thu_shop_back_end.repository.IOderDetailRepository;
import com.example.thy_thu_shop_back_end.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService implements IOrderDetailService {
    @Autowired
    private IOderDetailRepository oderDetailRepository;

    @Override
    public OrderDetail findById(Long id) {
        return null;
    }

    @Override
    public List<OrderDetail> findAll() {
        return null;
    }

    @Override
    public void save(OrderDetail orderDetail) {

    }

    @Override
    public void delete(Long id) {

    }
}
