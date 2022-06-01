package com.example.demo.service;

import java.util.List;


import com.example.demo.dao.UserDAO;
import com.example.demo.dto.UserDTO;
import com.example.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class UserServiceImpl implements IUserService{

    @Autowired
    private UserDAO dao;

    @Override
    public User createUser(User novo) {
        
        try {
            dao.save(novo);
            return novo;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        
    }

    @Override
    public List<UserDTO> readUsers() {
        try {
            return dao.getUsers();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public UserDTO readByIdUser(Integer id) {
        try {
            return dao.getUserById(id);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public User updateUser(User user) {
        try {
            return dao.save(user);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public boolean deleteUser(Integer id) {
        
        try {
            dao.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
       
    }
    
}
