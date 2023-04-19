package com.example.thy_thu_shop_back_end.service.impl;


import com.example.thy_thu_shop_back_end.model.AccountRole;
import com.example.thy_thu_shop_back_end.repository.IAccountRoleRepository;
import com.example.thy_thu_shop_back_end.service.IAccountRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountRoleService implements IAccountRoleService {
    @Autowired
    private IAccountRoleRepository accountRoleRepository;

    @Override
    public AccountRole findById(Long id) {
        return null;
    }

    @Override
    public List<AccountRole> findAll() {
        return null;
    }

    @Override
    public void save(AccountRole accountRole) {

    }

    @Override
    public void delete(Long id) {

    }
}
