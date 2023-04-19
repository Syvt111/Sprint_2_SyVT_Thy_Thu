package com.example.thy_thu_shop_back_end.model;

import javax.persistence.*;

@Entity
public class AccountRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "account_role_id")
    private Long accountRoleId;
    @ManyToOne
    @JoinColumn(name = "role_id" , referencedColumnName = "role_id")
    private Role role;
    @ManyToOne
    @JoinColumn(name = "account_id" , referencedColumnName = "account_id")
    private Account account;

    public AccountRole(Long accountRoleId, Role role, Account account) {
        this.accountRoleId = accountRoleId;
        this.role = role;
        this.account = account;
    }

    public AccountRole() {
    }

    public Long getAccountRoleId() {
        return accountRoleId;
    }

    public void setAccountRoleId(Long accountRoleId) {
        this.accountRoleId = accountRoleId;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
