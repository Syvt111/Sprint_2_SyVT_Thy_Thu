package com.example.thy_thu_shop_back_end.repository;

import com.example.thy_thu_shop_back_end.model.Cart;
import com.example.thy_thu_shop_back_end.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICartRepository extends JpaRepository<Cart,Integer> {
    @Query(value = "SELECT cart.* FROM cart cart join account ac on cart.account_id = ac.account_id WHERE ac.username =:username", nativeQuery = true)
    List<Cart> findCartByAccountUsername(@Param("username") String username);
    @Query(value = "SELECT cart.* FROM cart cart join account ac on cart.account_id = ac.account_id WHERE ac.username =:username and cart.product_id =:productId", nativeQuery = true)
    Cart findCartByAccountUsernameAndProductId(@Param("username") String username,@Param("productId") Long productId );

}
