package com.example.thy_thu_shop_back_end.security_authentication.service;


import com.example.thy_thu_shop_back_end.model.Account;
import com.example.thy_thu_shop_back_end.repository.IAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AccountDetailService implements UserDetailsService {

    @Autowired
IAccountRepository IAccountRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username)  {
        Account account = IAccountRepository.findAccountByEmail(username);
        if(account==null){
            throw new UsernameNotFoundException("User " + username + " was not found in the database");
        }
        return AccountDetails.build(account);
    }
}