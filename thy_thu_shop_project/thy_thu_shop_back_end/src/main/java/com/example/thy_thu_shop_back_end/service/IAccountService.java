package com.example.thy_thu_shop_back_end.service;

import com.example.thy_thu_shop_back_end.model.Account;
import com.example.thy_thu_shop_back_end.model.AccountRole;

import java.util.List;

public interface IAccountService {

    Account findById(Long id);

    List<Account> findAll();

    void save(Account account);

    void delete(Long id);
    Account findAccountByEmail(String username);
    Account findAccountByUsername(String username);
    void saveNewPassword(String newPassword, Long id);
    boolean checkPassword(String password, String oldPassword);
}
