package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.model.OrderDetail;
import com.example.thy_thu_shop_back_end.model.OrderProduct;
import com.example.thy_thu_shop_back_end.repository.IOrderProductRepository;
import com.example.thy_thu_shop_back_end.service.IOrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderProductService implements IOrderProductService {

    @Autowired
    private IOrderProductRepository orderProductRepository;

    @Override
    public OrderProduct findById(Long id) {

        Optional<OrderProduct> optionalOrderProduct = orderProductRepository.findById(id);
        if (optionalOrderProduct.isPresent()) {
            return optionalOrderProduct.get();
        } else {
            throw new ObjectNotFoundException("Order not found with id " + id);
        }
    }

    @Override
    public List<OrderProduct> findAll() {
        return orderProductRepository.findAll();
    }

    @Override
    public List<OrderProduct> findOrderByAccountUsername(String username) {
        return orderProductRepository.findOrderByAccountUsername(username);
    }

    @Override
    public void save(OrderProduct orderProduct) {
        orderProductRepository.save(orderProduct);
    }

    @Override
    public void delete(Long id) {
        orderProductRepository.deleteById(id);
    }
}
