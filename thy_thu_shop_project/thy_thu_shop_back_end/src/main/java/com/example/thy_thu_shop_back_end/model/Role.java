package com.example.thy_thu_shop_back_end.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private int roleId;
    @Column(columnDefinition = "varchar(50)", nullable = false, unique = true)
    private String roleName;
    @OneToMany(mappedBy = "role")
    @JsonIgnore
    private Set<AccountRole> accountRoleSet;

    public Role(int roleId, String roleName, Set<AccountRole> accountRoleSet) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.accountRoleSet = accountRoleSet;
    }

    public Role() {
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Set<AccountRole> getAccountRoleSet() {
        return accountRoleSet;
    }

    public void setAccountRoleSet(Set<AccountRole> accountRoleSet) {
        this.accountRoleSet = accountRoleSet;
    }
}
