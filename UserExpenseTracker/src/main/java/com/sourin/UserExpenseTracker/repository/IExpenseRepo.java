package com.sourin.UserExpenseTracker.repository;

import com.sourin.UserExpenseTracker.model.Expense;
import com.sourin.UserExpenseTracker.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IExpenseRepo extends JpaRepository<Expense,Long> {
         List<Expense> findAllByUser(User user);

    //List<Expense> findAllByUserAndExpenseDateBetween(User newUser, LocalDate maxDate, LocalDate minDate);
    @Modifying
    @Transactional
    @Query(value = "select * from expense where fk_user_id= :id and expense_date BETWEEN :minDate and :maxDate",nativeQuery = true)
    List<Expense> findAllByUserMaxAndMinDate(Long id, LocalDate minDate, LocalDate maxDate);
}
