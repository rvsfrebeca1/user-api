package com.example.demo.dao;

import com.example.demo.model.User;

import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Integer> {

    
    
}
