package com.sourin.EcommerceApp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String userName;
    @Email
    private String userEmail;
    private String userPassword;
    private String userNumber;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_user_id")
    private List<Address> addresses;
}
