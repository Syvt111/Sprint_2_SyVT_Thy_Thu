package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.model.Account;
import com.example.thy_thu_shop_back_end.repository.IAccountRepository;
import com.example.thy_thu_shop_back_end.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService implements IAccountService {
    @Autowired
    private IAccountRepository accountRepository;

    @Override
    public Account findById(Long id) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        return null;
    }

    @Override
    public void save(Account account) {

    }

    @Override
    public void delete(Long id) {

    }
}
