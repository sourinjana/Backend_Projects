package com.example.UserManagementSystemWithValidation.beanfactory;

import com.example.UserManagementSystemWithValidation.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserBeanList {
    @Bean
    public List<User> getList(){

        User initUser=new User(0,"sou", LocalDate.of(2000,04,21),"janasourin@gmail.com","8670042883",LocalDate.of(2018,05,26), LocalTime.of(12,3));
        List<User> initList=new ArrayList<>();
        initList.add(initUser);
        return initList;
    }
}
