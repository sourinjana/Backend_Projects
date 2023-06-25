package com.sourin.RestaurantDetails.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurant {
    private Integer id;
    private String restaurantName;
    private String address;
    private Integer number;
    private String specialty;
    private Integer staffs;

}
