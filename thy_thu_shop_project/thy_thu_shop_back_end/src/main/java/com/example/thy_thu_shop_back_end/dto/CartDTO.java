package com.example.thy_thu_shop_back_end.dto;
import com.example.thy_thu_shop_back_end.model.Account;
public class CartDTO {

    private int cartId;
    private int quantity;
    private Account account;
    private ProductDTO productDTO;

    public CartDTO() {
    }

    public CartDTO(int cartId, int quantity, Account account, ProductDTO productDTO) {
        this.cartId = cartId;
        this.quantity = quantity;
        this.account = account;
        this.productDTO = productDTO;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }
}
