package com.example.UserManagementSystemWithValidation.entity;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {

     @NotNull
    private Integer userId;
    @NotBlank
    private String userName;
     @NotNull
    private LocalDate userDOB;

    @Email(message = "Given email id is invalid")

    private String userEmail;
    //@Size(min = 10,max = 12)
   @Pattern(regexp = "^\\d{2}\\d{10}$")
    private String userNumber;
     @NotNull
    private  LocalDate userDate;

   @NotNull
    private LocalTime userTime;
}
