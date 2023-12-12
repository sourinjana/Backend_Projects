package com.example.UserManagementSystemWithValidation.service;

import com.example.UserManagementSystemWithValidation.entity.User;
import com.example.UserManagementSystemWithValidation.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getAllUser() {
        return userRepo.getUserList();
    }

    public String addUsers(List<User> users) {

        List<User> orginalList=getAllUser();
        orginalList.addAll(users);
        return "add done";
    }

    public List<User> getUserById(Integer id) {
      List<User> userById=new ArrayList<>();
        List<User> orginalList=getAllUser();

        for(User u:orginalList){
            if(u.getUserId()==id){
                userById.add(u);
                return userById;
            }
        }

        return userById;
    }

    public String updateEmail(Integer id, String email) {

        List<User> orginalList=getAllUser();

        for(User u:orginalList){
            if(u.getUserId()==id){
                u.setUserEmail(email);
                return "Update done with id : "+id+"with email id : "+email;
            }
        }

        return "Update not done id : "+id+" not found";
    }

    public String deleteUser(Integer id) {
        List<User> orginalList=getAllUser();

        for(User u:orginalList){
            if(u.getUserId()==id){
                orginalList.remove(u);
                return "Delete done with id : "+id;
            }
        }

        return "Delete not done id : "+id+" not found";
    }
}
