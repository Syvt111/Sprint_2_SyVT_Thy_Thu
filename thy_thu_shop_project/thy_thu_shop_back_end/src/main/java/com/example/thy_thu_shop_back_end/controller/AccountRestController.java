package com.example.thy_thu_shop_back_end.controller;
import com.example.thy_thu_shop_back_end.model.Account;
import com.example.thy_thu_shop_back_end.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin("*")
@RequestMapping("/api/accounts")
public class AccountRestController {
    @Autowired
    private IAccountService accountService;

    @GetMapping("/username")
    public ResponseEntity<Account> findAllCartByUsername(@RequestParam String username) {
        Account account = accountService.findAccountByUsername(username);
        if (account == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

}
