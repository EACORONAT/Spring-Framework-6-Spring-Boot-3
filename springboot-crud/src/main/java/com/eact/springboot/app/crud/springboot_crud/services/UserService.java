package com.eact.springboot.app.crud.springboot_crud.services;

import java.util.List;

import com.eact.springboot.app.crud.springboot_crud.entities.User;

public interface UserService {
    
    List<User> findAll();

    User save(User user);

    boolean existsByUsername(String username);
}
