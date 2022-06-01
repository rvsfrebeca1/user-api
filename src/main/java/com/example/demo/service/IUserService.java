package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;



public interface IUserService {
    public User createUser(User novo);
    public List<User> readUsers ();
    public User readByIdUser (Integer id);
    public User updateUser (User user);
    public boolean deleteUser(Integer id);
}
