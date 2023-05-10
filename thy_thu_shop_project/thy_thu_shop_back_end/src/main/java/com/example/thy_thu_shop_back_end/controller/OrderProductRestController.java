package com.example.thy_thu_shop_back_end.controller;

import com.example.thy_thu_shop_back_end.model.Cart;
import com.example.thy_thu_shop_back_end.model.OrderDetail;
import com.example.thy_thu_shop_back_end.model.OrderProduct;
import com.example.thy_thu_shop_back_end.model.Product;
import com.example.thy_thu_shop_back_end.security_authentication.jwt.JwtFilter;
import com.example.thy_thu_shop_back_end.security_authentication.jwt.JwtUtility;
import com.example.thy_thu_shop_back_end.service.ICartService;
import com.example.thy_thu_shop_back_end.service.IOrderDetailService;
import com.example.thy_thu_shop_back_end.service.IOrderProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/orders")
public class OrderProductRestController {

    @Autowired
    private IOrderProductService orderProductService;
    @Autowired
    private IOrderDetailService orderDetailService;
    @Autowired
    private ICartService cartService;
    @Autowired
    private JwtUtility jwtUtility;

    @GetMapping("/history")
    public ResponseEntity<List<OrderProduct>> findOrderByAccountUsername(HttpServletRequest httpServletRequest) {
        String token = JwtFilter.parseJwt(httpServletRequest);
        String username = jwtUtility.getUserNameFromJwtToken(token);
        List<OrderProduct> orderProductList = orderProductService.findOrderByAccountUsername(username);
        if (orderProductList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(orderProductList, HttpStatus.OK);
    }

    @GetMapping("/detail")
    public ResponseEntity<List<OrderDetail>> findAllOrderDetail() {
        List<OrderDetail> orderDetailList = orderDetailService.findAll();
        if (orderDetailList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(orderDetailList, HttpStatus.OK);
    }

    @GetMapping("/detail/{orderId}")
    public ResponseEntity<List<OrderDetail>> findOrderDetailByOrderId(@PathVariable Long orderId) {
        List<OrderDetail> orderDetailList = orderDetailService.findOrderDetailByOrderId(orderId);
        if (orderDetailList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(orderDetailList, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<List<FieldError>> saveCart(HttpServletRequest httpServletRequest) {
        float totalPrice = 0;
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        String token = JwtFilter.parseJwt(httpServletRequest);
        String username = jwtUtility.getUserNameFromJwtToken(token);
        OrderProduct orderProduct = new OrderProduct();
        OrderDetail orderDetail = new OrderDetail();
        List<Cart> cartList = cartService.findCartByAccountUsername(username);
        if (cartList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            for (Cart cartOder : cartList
            ) {
                totalPrice += cartOder.getQuantity() * cartOder.getProduct().getPrice();
            }
            orderProduct.setTimeOrder(formattedDateTime);
            orderProduct.setTotalPrice(totalPrice);
            orderProduct.setAccount(cartList.get(0).getAccount());
            orderProductService.save(orderProduct);
            for (Cart cartOder : cartList
            ) {
                if (orderDetailService.findNewOrderDetail() == null) {
                    orderDetail.setOrderDetailId(1L);
                } else {
                    orderDetail.setOrderDetailId(orderDetailService.findNewOrderDetail().getOrderDetailId() + 1);
                }
                orderDetail.setQuantity(cartOder.getQuantity());
                orderDetail.setOrder(orderProduct);
                orderDetail.setProduct(cartOder.getProduct());
                orderDetailService.save(orderDetail);
            }
            return new ResponseEntity<>(HttpStatus.CREATED);
        }

    }

}
