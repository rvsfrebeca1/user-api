package com.example.demo.controller;
import java.util.List;
import com.example.demo.model.User;
import com.example.demo.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    
    @Autowired
    private IUserService service;


    @GetMapping("/")
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Welcome to User API");

    }

    @GetMapping("/read")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok(service.readUsers());
    }

    @DeleteMapping("/delete/{id}")
    public Boolean deleteUser(@PathVariable Integer id){
        return service.deleteUser(id);

    }

    @PostMapping("/create/")
    public User createUser(@RequestBody User novo) {
        return service.createUser(novo);
    }

    @PutMapping("/update")
    public User updatUser (@RequestBody User user){
        return service.updateUser(user);
    }




   


   
}
