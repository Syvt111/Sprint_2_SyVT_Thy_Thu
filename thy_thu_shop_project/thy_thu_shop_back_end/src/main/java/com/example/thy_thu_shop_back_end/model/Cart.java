package com.example.thy_thu_shop_back_end.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity

public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private int cartId;
    private int quality;

    @OneToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    @JsonIgnore
    private Account account;

    @ManyToOne
    @JoinColumn(name = "product_id" , referencedColumnName = "product_id")
    private Product product;

    public Cart(int cartId, int quality, Account account, Product product) {
        this.cartId = cartId;
        this.quality = quality;
        this.account = account;
        this.product = product;
    }

    public Cart() {
    }

    public int getCartId() {
        return cartId;
    }

    public int getQuality() {
        return quality;
    }

    public Account getAccount() {
        return account;
    }

    public Product getProduct() {
        return product;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
