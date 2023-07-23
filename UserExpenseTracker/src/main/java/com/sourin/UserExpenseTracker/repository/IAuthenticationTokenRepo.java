package com.sourin.UserExpenseTracker.repository;

import com.sourin.UserExpenseTracker.model.AuthenticationToken;
import com.sourin.UserExpenseTracker.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAuthenticationTokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String tokenValue);
}
