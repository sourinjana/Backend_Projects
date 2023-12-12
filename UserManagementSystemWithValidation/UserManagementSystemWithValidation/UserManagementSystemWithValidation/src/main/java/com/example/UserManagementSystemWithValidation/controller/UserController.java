package com.example.UserManagementSystemWithValidation.controller;

import com.example.UserManagementSystemWithValidation.entity.User;
import com.example.UserManagementSystemWithValidation.service.UserService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@Validated
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("users")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("uid/{id}")
    public List<User> getUserById(@PathVariable  Integer id){
        return userService.getUserById(id);
    }

    @PostMapping("users")
    public String addUsers(@RequestBody @Valid List<User> users){
        return userService.addUsers(users);
    }

    @PutMapping("id/{id}/email/{email}")
    public String updateEmail(@PathVariable  Integer id, @PathVariable @Email String email){
        return userService.updateEmail(id,email);
    }

    @DeleteMapping("id/{id}")
    public String deleteUser(@PathVariable  Integer id){
        return userService.deleteUser(id);
    }



}
