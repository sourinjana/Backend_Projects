package com.sourin.UserExpenseTracker.service;

import com.sourin.UserExpenseTracker.model.AuthenticationToken;
import com.sourin.UserExpenseTracker.repository.IAuthenticationTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationTokenService {

    @Autowired
    IAuthenticationTokenRepo authenticationTokenRepo;

    public void saveAuthToken(AuthenticationToken authenticationToken){
        authenticationTokenRepo.save(authenticationToken);
    }

    public boolean validateAuth(String userEmail, String tokenValue) {
       AuthenticationToken authenticationToken=authenticationTokenRepo.findFirstByTokenValue(tokenValue);

       if(authenticationToken==null){
           return false;
       }

       String tokenConnectedEmail=authenticationToken.getUser().getUserEmail();

       if(tokenConnectedEmail.equals(userEmail)){
           return true;
       }
       return false;
    }
}
