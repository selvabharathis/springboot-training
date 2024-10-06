package com.example.demo.controller;

import com.example.demo.crosscutting.custom.Authenticated;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping
    //@Authenticated
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping
    //@Authenticated
    public User createUser(@RequestParam String name) {
        return userService.createUser(name);
    }
}
