package com.example.thy_thu_shop_back_end.model;

import javax.persistence.*;

@Entity
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_detail_id")
    private Long orderDetailId;
    @Column(columnDefinition = "int", nullable = false)
    private int quantity;
    @ManyToOne
    @JoinColumn(name = "order_id" , referencedColumnName = "order_id")
    private OrderProduct order;
    @ManyToOne
    @JoinColumn(name = "product_id" , referencedColumnName = "product_id")
    private Product product;

    public OrderDetail(Long orderDetailId, int quantity, OrderProduct order, Product product) {
        this.orderDetailId = orderDetailId;
        this.quantity = quantity;
        this.order = order;
        this.product = product;
    }

    public OrderDetail() {
    }

    public Long getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Long orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public OrderProduct getOrder() {
        return order;
    }

    public void setOrder(OrderProduct order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
