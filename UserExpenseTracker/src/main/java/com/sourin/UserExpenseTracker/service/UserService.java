package com.sourin.UserExpenseTracker.service;

import com.sourin.UserExpenseTracker.model.AuthenticationToken;
import com.sourin.UserExpenseTracker.model.Expense;
import com.sourin.UserExpenseTracker.model.User;
import com.sourin.UserExpenseTracker.model.dto.SignInInput;
import com.sourin.UserExpenseTracker.repository.IUserRepo;
import com.sourin.UserExpenseTracker.service.emailUtility.EmailHandler;
import com.sourin.UserExpenseTracker.service.hashingUtility.PasswordEncrypter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.List;

@Service
public class UserService {

    @Autowired
    IUserRepo userRepo;

    @Autowired
    AuthenticationTokenService authenticationTokenService;

    @Autowired
    ExpenseService expenseService;

    public String userSignUp(User user) {

        String newEmail=user.getUserEmail();

        if(newEmail==null){
            return "Invalid Email ";
        }
        User existingUser=userRepo.findFirstByUserEmail(newEmail);

        if(existingUser!=null){
            return "Email already registered!!! Please Sign In !!";
        }

        try {
            String encrypPassword= PasswordEncrypter.encryptPassword(user.getUserPassword());
            user.setUserPassword(encrypPassword);
            userRepo.save(user);
            return "Sign Up Completed !! Please Sign In";
        } catch (Exception e) {
            return "Internal error occurred during sign up";
        }
    }

    public String userSignIn(SignInInput signInInput) {

          String newEmail=signInInput.getUserEmail();

          if(newEmail==null){
              return "Invalid Email ";
          }

        User existingUser=userRepo.findFirstByUserEmail(newEmail);
          if(existingUser==null){
              return "You hava do not Account !! Please SignUp First !!";
          }

        try {
            String encrypPassword=PasswordEncrypter.encryptPassword(signInInput.getUserPassword());

            if(existingUser.getUserPassword().equals(encrypPassword)){
                AuthenticationToken authenticationToken=new AuthenticationToken(existingUser);
                EmailHandler.sendEmail(newEmail,"OTP-Auth",authenticationToken.getTokenValue());
               authenticationTokenService.saveAuthToken(authenticationToken);
                return "Token sent to your email";
            }else{
                return "Invalid credentials!!!";
            }
        } catch (Exception e) {

            return "Internal error occurred during sign in";
        }

    }

    public String addExpense(Expense expense,String userEmail) {
        User newUser=userRepo.findFirstByUserEmail(userEmail);
          expense.setUser(newUser);
        return expenseService.addExpense(expense);
    }

    public List<Expense> getAllExpense(String userEmail) {
        User newUser=userRepo.findFirstByUserEmail(userEmail);
        return expenseService.getAllExpense(newUser);
    }

    public String betweenExpenditure(String userEmail, LocalDate minDate,LocalDate maxDate) {
        User newUser=userRepo.findFirstByUserEmail(userEmail);
         return expenseService.betweenExpenditure(newUser,minDate,maxDate);
    }
}
