package com.example.thy_thu_shop_back_end.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_id")
    private Long accountId;
    @Column(columnDefinition = "varchar(50)", unique = true, nullable = false)
    private String email;
    @Column(columnDefinition = "text", nullable = false)
    private String password;
    @Column(columnDefinition = "varchar(50)", unique = true, nullable = false)
    private String username;
    @Column(columnDefinition = "bit(1)", nullable = false)
    private boolean flagDelete = false;
    @Column(columnDefinition = "varchar(255)", unique = true, nullable = false)
    private String name;
    @Column(columnDefinition = "longText", nullable = false)
    private String avatar;
    @Column(columnDefinition = "bit(1)", nullable = false)
    private boolean gender;
    @Column(columnDefinition = "varchar(45)", unique = true, nullable = false)
    private String phoneNumber;
    @Column(columnDefinition = "varchar(255)", nullable = false)
    private String address;
    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private Set<AccountRole> accountRoleSet;
    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private Set<OrderProduct> orderSet;


    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private Set<Cart> cartSet;

    public Account(Long accountId, String email, String password, String username, boolean flagDelete, String name, String avatar, boolean gender, String phoneNumber, String address, Set<AccountRole> accountRoleSet, Set<OrderProduct> orderSet, Set<Cart> cartSet) {
        this.accountId = accountId;
        this.email = email;
        this.password = password;
        this.username = username;
        this.flagDelete = flagDelete;
        this.name = name;
        this.avatar = avatar;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.accountRoleSet = accountRoleSet;
        this.orderSet = orderSet;
        this.cartSet = cartSet;
    }


    public Account() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isFlagDelete() {
        return flagDelete;
    }

    public void setFlagDelete(boolean flagDelete) {
        this.flagDelete = flagDelete;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<AccountRole> getAccountRoleSet() {
        return accountRoleSet;
    }

    public void setAccountRoleSet(Set<AccountRole> accountRoleSet) {
        this.accountRoleSet = accountRoleSet;
    }

    public Set<OrderProduct> getOrderSet() {
        return orderSet;
    }

    public void setOrderSet(Set<OrderProduct> orderSet) {
        this.orderSet = orderSet;
    }

    public Set<Cart> getCartSet() {
        return cartSet;
    }

    public void setCartSet(Set<Cart> cartSet) {
        this.cartSet = cartSet;
    }
}
