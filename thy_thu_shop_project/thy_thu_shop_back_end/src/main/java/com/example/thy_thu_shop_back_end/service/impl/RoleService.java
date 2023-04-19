package com.example.thy_thu_shop_back_end.service.impl;

import com.example.thy_thu_shop_back_end.model.Role;
import com.example.thy_thu_shop_back_end.repository.IRoleRepository;
import com.example.thy_thu_shop_back_end.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements IRoleService {
    @Autowired
    private IRoleRepository roleRepository;

    @Override
    public Role findById(int id) {
        return null;
    }

    @Override
    public List<Role> findAll() {
        return null;
    }

    @Override
    public void save(Role Role) {

    }

    @Override
    public void delete(int id) {

    }
}
