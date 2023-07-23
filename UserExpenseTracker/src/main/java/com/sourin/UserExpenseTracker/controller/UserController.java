package com.sourin.UserExpenseTracker.controller;

import com.sourin.UserExpenseTracker.model.Expense;
import com.sourin.UserExpenseTracker.model.User;
import com.sourin.UserExpenseTracker.model.dto.SignInInput;
import com.sourin.UserExpenseTracker.service.AuthenticationTokenService;
import com.sourin.UserExpenseTracker.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Validated
@RestController
public class UserController {


    @Autowired
    UserService userService;

    @Autowired
    AuthenticationTokenService authenticationTokenService;

    @PostMapping("signup/user")
    public String userSignUp(@RequestBody User user){
        return userService.userSignUp(user);
    }

    @PostMapping("signin/user")
    public String userSignIn(@RequestBody @Valid SignInInput signInInput){
        return userService.userSignIn(signInInput);
    }

    @PostMapping("expense/add")
    public String addExpense(@RequestBody Expense expense, @RequestParam String userEmail,@RequestParam String tokenValue){
        if(authenticationTokenService.validateAuth(userEmail,tokenValue)){
            return userService.addExpense(expense,userEmail);
        }else{
            return "Not an Authenticated user activity!!!";
        }

    }





    @GetMapping("expense/show/all")
    public List<Expense> getAllExpense(@RequestParam String userEmail, @RequestParam String tokenValue){
        if(authenticationTokenService.validateAuth(userEmail,tokenValue)){
            return userService.getAllExpense(userEmail);
        }else {
            return null;
        }

    }



//    @GetMapping("expense/show/all")
//    public List<Expense> getAllExpense(@RequestParam String userEmail, @RequestParam String tokenValue){
//        if(authenticationTokenService.validateAuth(userEmail,tokenValue)){
//            return userService.getAllExpense(userEmail);
//        }else {
//            return null;
//        }
//
//    }




    @GetMapping("total/expenditure/{endDate}/{startDate} ")
    public String betweenExpenditure(@RequestParam String userEmail, @RequestParam String tokenValue, @PathVariable LocalDate endDate,@PathVariable LocalDate startDate){
        if(authenticationTokenService.validateAuth(userEmail,tokenValue)){
             return userService.betweenExpenditure(userEmail,endDate,startDate);
        }else{
            return "Not an Authenticated user activity!!!";
        }

    }







}
