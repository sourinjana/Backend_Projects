package com.sourin.EcommerceApp.service;

import com.sourin.EcommerceApp.model.User;
import com.sourin.EcommerceApp.repository.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepo userRepo;

    public String addUser(User user) {
        userRepo.save(user);
        return "add done";
    }

    public Optional<User> getUserById(Integer id) {

        return userRepo.findById(id);
    }
}
