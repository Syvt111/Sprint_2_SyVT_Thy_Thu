package com.example.thy_thu_shop_back_end.service;

import com.example.thy_thu_shop_back_end.model.AccountRole;

import java.util.List;

public interface IAccountRoleService {
    AccountRole findById(Long id);

    List<AccountRole> findAll();

    void save(AccountRole accountRole);

    void delete(Long id);
}
