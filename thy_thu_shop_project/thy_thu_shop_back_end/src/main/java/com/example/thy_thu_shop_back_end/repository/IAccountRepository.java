package com.example.thy_thu_shop_back_end.repository;

import com.example.thy_thu_shop_back_end.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<Account,Long> {

    @Query(value = "select a.* from account a where a.email = ?1",nativeQuery = true)
    Account findAccountByEmail(String username);



    @Modifying
    @Query(value = "update account set password =?1 where id =?2 ",nativeQuery = true)
    void saveNewPassword(String newPassword, Long id);

}
