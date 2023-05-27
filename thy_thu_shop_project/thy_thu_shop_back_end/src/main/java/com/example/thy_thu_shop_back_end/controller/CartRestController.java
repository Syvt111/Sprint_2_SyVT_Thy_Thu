package com.example.thy_thu_shop_back_end.controller;

import com.example.thy_thu_shop_back_end.model.Cart;
import com.example.thy_thu_shop_back_end.model.Image;
import com.example.thy_thu_shop_back_end.model.Product;
import com.example.thy_thu_shop_back_end.security_authentication.jwt.JwtFilter;
import com.example.thy_thu_shop_back_end.security_authentication.jwt.JwtUtility;
import com.example.thy_thu_shop_back_end.service.ICartService;
import com.example.thy_thu_shop_back_end.service.IImageService;
import com.example.thy_thu_shop_back_end.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;
import java.util.Set;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/carts")
public class CartRestController {
    @Autowired
    private IProductService productService;

    @Autowired
    private ICartService cartService;
    @Autowired
    private IImageService imageService;
    @Autowired
    private JwtUtility jwtUtility;

    @GetMapping("/username")
    public ResponseEntity<List<Cart>> findAllCartByUsername(@RequestParam String username) {
        List<Cart> cartList = cartService.findCartByAccountUsername(username);


        if (cartList == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(cartList, HttpStatus.OK);
    }


    @GetMapping("/username/{productId}")
    public ResponseEntity<Cart> findAllCartByUsername(@RequestParam String username, @PathVariable Long productId) {
        Cart cart = cartService.findCartByAccountUsernameAndProductId(username, productId);
        if (cart == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<Cart>> findAllCart() {
        List<Cart> cartList = cartService.findAllInCart();
        if (cartList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(cartList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<List<FieldError>> saveCart(@Validated @RequestBody Cart cart, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity<>(bindingResult.getFieldErrors(), HttpStatus.NOT_ACCEPTABLE);
        }
        this.cartService.save(cart);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{cartId}")
    public ResponseEntity<List<FieldError>> updateCart(@Validated @RequestBody Cart cartUpdate, @PathVariable int cartId, BindingResult bindingResult) {
        Cart cart = cartService.findById(cartId);
        if (cart == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            if (bindingResult.hasErrors()) {
                return new ResponseEntity<>(bindingResult.getFieldErrors(), HttpStatus.NOT_ACCEPTABLE);
            }
            this.cartService.save(cartUpdate);
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }

    @GetMapping("/add/{productId}")
    public ResponseEntity<Product> addProductToCart(@PathVariable Long productId, @RequestParam String username) {
        Product product = productService.findById(productId);
        List<Cart> cartList = cartService.findCartByAccountUsername(username);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        } else {
            for (Cart cart : cartList
            ) {
                if (Objects.equals(cart.getProduct().getProductId(), product.getProductId())) {
                    cart.setProduct(product);
                    cart.setQuantity(1);
                    cart.setAccount(cart.getAccount());
                    cartService.save(cart);
                } else {
                    for (Cart c : cartList
                    ) {
                        if (c.getProduct().getProductId().equals(product.getProductId())) {
                            c.setQuantity(c.getQuantity() + 1);
                        }
                    }
                }
            }
            return new ResponseEntity<>(HttpStatus.CREATED);
        }
    }

    @DeleteMapping("/sub/{productId}")
    public ResponseEntity<Product> subProductFromCart(@PathVariable Long productId, @RequestParam String username) {
        Product product = productService.findById(productId);
        List<Cart> cartList = cartService.findCartByAccountUsername(username);
        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        } else {
            for (Cart cart : cartList
            ) {
                if (Objects.equals(cart.getProduct().getProductId(), product.getProductId())) {
                    if (cart.getQuantity() <= 1) {
                        cartService.delete(cart.getCartId());
                    } else {
                        cart.setProduct(cart.getProduct());
                        cart.setQuantity(cart.getQuantity() - 1);
                        cart.setAccount(cart.getAccount());
                        cartService.save(cart);
                    }
                }
            }
            return new ResponseEntity<>(HttpStatus.OK);
        }
    }

    @DeleteMapping("/{cartId}")
    public ResponseEntity<Cart> deleteTeacherById(@PathVariable int cartId) {
        Cart cart = cartService.findById(cartId);
        if (cart == null) {
            return ResponseEntity.notFound().build();
        }
        cartService.delete(cartId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/username")
    public ResponseEntity<?> deleteTeacherById(HttpServletRequest httpServletRequest) {
        String token = JwtFilter.parseJwt(httpServletRequest);
        String username = jwtUtility.getUserNameFromJwtToken(token);
        cartService.deleteByUsername(username);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
