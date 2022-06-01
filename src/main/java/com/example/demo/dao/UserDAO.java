package com.example.demo.dao;


import java.util.List;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;

import org.springframework.data.jpa.repository.Query;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserDAO extends CrudRepository<User, Integer> {
    @Query("SELECT new com.example.demo.dto.UserDTO(users.email, users.telephone, users.birthDate) FROM User as users")
    public List<UserDTO> getUsers();

    @Query("SELECT new com.example.demo.dto.UserDTO(users.email, users.telephone, users.birthDate) FROM User as users WHERE users.id = :id")
    public UserDTO getUserById(@Param("id") Integer id);
    
}
