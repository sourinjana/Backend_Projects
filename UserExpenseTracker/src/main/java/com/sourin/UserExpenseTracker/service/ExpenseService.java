package com.sourin.UserExpenseTracker.service;

import com.sourin.UserExpenseTracker.model.Expense;
import com.sourin.UserExpenseTracker.model.User;
import com.sourin.UserExpenseTracker.repository.IExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    IExpenseRepo expenseRepo;
    public String addExpense(Expense expense) {
    //  expense.setExpenseDateTime(LocalDateTime.now());
        expenseRepo.save(expense);
        return "save expense";
    }


    public List<Expense> getAllExpense(User newUser) {
        return expenseRepo.findAllByUser(newUser);
    }

    public String betweenExpenditure(User newUser,LocalDate minDate,LocalDate maxDate) {
       List<Expense> reportList= expenseRepo.findAllByUserMaxAndMinDate(newUser.getUserId(),minDate,maxDate);
         double total=0;
       for(Expense e:reportList){
           total+=e.getExpensePrice();
       }

        return "Your Total Expense : "+maxDate+" : to : "+minDate+" = "+total;



    }
}
