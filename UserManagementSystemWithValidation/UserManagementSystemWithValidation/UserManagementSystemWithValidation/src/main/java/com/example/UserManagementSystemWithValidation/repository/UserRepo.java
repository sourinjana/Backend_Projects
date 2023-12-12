package com.example.UserManagementSystemWithValidation.repository;

import com.example.UserManagementSystemWithValidation.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {

    @Autowired
       public List<User> userList;



       public List<User> getUserList(){
           return userList;
       }
}
