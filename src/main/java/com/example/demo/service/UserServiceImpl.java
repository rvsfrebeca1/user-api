package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.dao.UserDAO;
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
    public List<User> readUsers() {
        try {
            return (List<User>) dao.findAll();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public Optional<User> readByIdUser(Integer id) {
        try {
            return dao.findById(id);
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
