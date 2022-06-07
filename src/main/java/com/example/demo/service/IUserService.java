package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.User;

public interface IUserService {
    public User createUser(User novo);
    public List<User> readUsers ();
    public Optional<User> readByIdUser (Integer id);
    public User updateUser (User user);
    public boolean deleteUser(Integer id);
}
