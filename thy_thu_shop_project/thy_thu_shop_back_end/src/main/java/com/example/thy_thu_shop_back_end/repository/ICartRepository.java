package com.example.thy_thu_shop_back_end.repository;

import com.example.thy_thu_shop_back_end.model.Cart;
import com.example.thy_thu_shop_back_end.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ICartRepository extends JpaRepository<Cart,Integer> {
    @Query(value = "SELECT cart.* FROM cart cart join account ac on cart.account_id = ac.account_id WHERE ac.username =:username", nativeQuery = true)
    List<Cart> findCartByAccountUsername(@Param("username") String username);
    @Modifying
    @Query(value = "DELETE c FROM cart c INNER JOIN account a ON c.account_id = a.account_id WHERE a.username =:username", nativeQuery = true)
    void deleteCartByUsername(String username);

    @Query(value = "SELECT cart.* FROM cart cart join account ac on cart.account_id = ac.account_id WHERE ac.username =:username and cart.product_id =:productId", nativeQuery = true)
    Cart findCartByAccountUsernameAndProductId(@Param("username") String username,@Param("productId") Long productId );

}
