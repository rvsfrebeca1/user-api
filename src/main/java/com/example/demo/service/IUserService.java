package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;

public interface IUserService {
    public User createUser(User novo);
    public List<UserDTO> readUsers ();
    public UserDTO readByIdUser (Integer id);
    public User updateUser (User user);
    public boolean deleteUser(Integer id);
}
