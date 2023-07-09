package com.sourin.EcommerceApp.controller;

import com.sourin.EcommerceApp.model.Address;
import com.sourin.EcommerceApp.model.MyOrder;
import com.sourin.EcommerceApp.model.User;
import com.sourin.EcommerceApp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("user/{id}")
    public Optional<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }



}
