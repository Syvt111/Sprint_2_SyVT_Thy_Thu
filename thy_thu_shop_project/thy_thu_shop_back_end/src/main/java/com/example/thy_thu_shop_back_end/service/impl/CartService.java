package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.model.Cart;
import com.example.thy_thu_shop_back_end.model.Product;
import com.example.thy_thu_shop_back_end.repository.ICartRepository;
import com.example.thy_thu_shop_back_end.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class CartService implements ICartService {
    @Autowired
    private ICartRepository cartRepository;

    @Override
    public Cart findById(int id) {

        Optional<Cart> optionalCart = cartRepository.findById(id);
        if (optionalCart.isPresent()) {
            return optionalCart.get();
        } else {
            throw new ObjectNotFoundException("Product not found with id " + id);
        }
    }

    @Override
    public List<Cart> findCartByAccountUsername(String username) {
        return cartRepository.findCartByAccountUsername(username);
    }

    @Override
    public Cart findCartByAccountUsernameAndProductId(String username, Long productId) {
        return cartRepository.findCartByAccountUsernameAndProductId(username, productId);
    }

    @Override
    public List<Cart> findAllInCart() {
        return cartRepository.findAll();
    }

    @Override
    public void save(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public void delete(int id) {
        cartRepository.deleteById(id);
    }

    @Override
    public void deleteByUsername(String username) {
        cartRepository.deleteCartByUsername(username);
    }

}