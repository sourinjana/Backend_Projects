package com.sourin.UserExpenseTracker.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long expenseId;

    private String expenseTitle;
    private String expenseDescription;

    private Double expensePrice;
  //  @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private LocalDate expenseDate;

    @ManyToOne
    @JoinColumn(name = "fk_user_id")
    private User user;

}
