package com.example.thy_thu_shop_back_end.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;
    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String productCode;
    @Column(columnDefinition = "varchar(50)", nullable = false)
    private String productName;
    @Column(columnDefinition = "double", nullable = false)
    private double price;
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String description;
    @Column(columnDefinition = "bit(1)", nullable = false)
    private boolean flagDelete = false;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id")
    private Category category;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private Set<Image> imageSet;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private Set<OrderDetail> orderDetailSet;

    @OneToMany(mappedBy = "product")
    @JsonIgnore
    private Set<Cart> cartSet;

    public Product(Long productId, String productCode, String productName, double price, String description, boolean flagDelete, Category category, Set<Image> imageSet, Set<OrderDetail> orderDetailSet, Set<Cart> cartSet) {
        this.productId = productId;
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.flagDelete = flagDelete;
        this.category = category;
        this.imageSet = imageSet;
        this.orderDetailSet = orderDetailSet;
        this.cartSet = cartSet;
    }

    public Product() {
    }

    public Set<Cart> getCartSet() {
        return cartSet;
    }

    public void setCartSet(Set<Cart> cartSet) {
        this.cartSet = cartSet;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        this.flagDelete = flagDelete;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Set<Image> getImageSet() {
        return imageSet;
    }

    public void setImageSet(Set<Image> imageSet) {
        this.imageSet = imageSet;
    }

    public Set<OrderDetail> getOrderDetailSet() {
        return orderDetailSet;
    }

    public void setOrderDetailSet(Set<OrderDetail> orderDetailSet) {
        this.orderDetailSet = orderDetailSet;
    }
}
