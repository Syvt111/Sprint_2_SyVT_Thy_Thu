package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.model.OrderProduct;
import com.example.thy_thu_shop_back_end.repository.IOrderProductRepository;
import com.example.thy_thu_shop_back_end.service.IOrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderProductService implements IOrderProductService {

    @Autowired
    private IOrderProductRepository orderProductRepository;

    @Override
    public OrderProduct findById(Long id) {
        return null;
    }

    @Override
    public List<OrderProduct> findAll() {
        return null;
    }

    @Override
    public void save(OrderProduct orderProduct) {

    }

    @Override
    public void delete(Long id) {

    }
}
