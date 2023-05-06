package com.example.thy_thu_shop_back_end.service;

import com.example.thy_thu_shop_back_end.model.Cart;



import java.util.List;

public interface ICartService {
    Cart findById(int id);

    List<Cart> findCartByAccountUsername(String username);

    Cart findCartByAccountUsernameAndProductId(String username, Long productId);

    List<Cart> findAllInCart();

    void save(Cart cart);

    void delete(int id);

}
