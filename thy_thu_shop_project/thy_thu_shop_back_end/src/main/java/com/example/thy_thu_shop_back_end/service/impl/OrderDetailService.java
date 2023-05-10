package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.model.OrderDetail;
import com.example.thy_thu_shop_back_end.model.Product;
import com.example.thy_thu_shop_back_end.repository.IOderDetailRepository;
import com.example.thy_thu_shop_back_end.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderDetailService implements IOrderDetailService {
    @Autowired
    private IOderDetailRepository oderDetailRepository;

    @Override
    public OrderDetail findById(Long id) {
        Optional<OrderDetail> optionalOrderDetail = oderDetailRepository.findById(id);
        if (optionalOrderDetail.isPresent()) {
            return optionalOrderDetail.get();
        } else {
            throw new ObjectNotFoundException("OrderDetail not found with id " + id);
        }
    }

    @Override
    public List<OrderDetail> findAll() {
        return oderDetailRepository.findAll();
    }

    @Override
    public List<OrderDetail> findOrderDetailByOrderId(Long id) {
        return oderDetailRepository.findOrderDetailByOrderId(id);
    }

    @Override
    public void save(OrderDetail orderDetail) {
        oderDetailRepository.save(orderDetail);
    }

    @Override
    public void delete(Long id) {
        oderDetailRepository.deleteById(id);
    }

    @Override
    public OrderDetail findNewOrderDetail() {
        return oderDetailRepository.findNewOrderDetail();
    }
}
