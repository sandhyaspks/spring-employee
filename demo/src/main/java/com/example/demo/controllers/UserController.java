package com.example.demo.controllers;

import com.example.demo.models.UserDetails;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // POST API to register a user
    @PostMapping("/register")
    public String registerUser(@RequestBody UserDetails user) {
        userService.saveUser(user);
        return "User registered successfully!";
    }

    @GetMapping("/{empId}")
    public UserDetails getUser(@PathVariable String empId) {
        return userService.getUser(empId);
    }
}
