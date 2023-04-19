package com.example.thy_thu_shop_back_end.service;

import com.example.thy_thu_shop_back_end.model.Account;
import com.example.thy_thu_shop_back_end.model.AccountRole;
import com.example.thy_thu_shop_back_end.model.Category;

import java.util.List;

public interface ICategoryService {
    Category findById(int id);

    List<Category> findAll();

    void save(Category category);

    void delete(int id);
}
