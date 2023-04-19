package com.example.thy_thu_shop_back_end.service;

import com.example.thy_thu_shop_back_end.model.Product;
import com.example.thy_thu_shop_back_end.model.Role;

import java.util.List;

public interface IRoleService {
    Role findById(int id);

    List<Role> findAll();

    void save(Role Role);

    void delete(int id);
}
