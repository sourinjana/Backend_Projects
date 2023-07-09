package com.sourin.EcommerceApp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;

    private String addressName;
    private String addressLandmark;
    private String addressPhNumber;
    private String addressCity;
    private String addressState;
    private String addressZipcode;

}
