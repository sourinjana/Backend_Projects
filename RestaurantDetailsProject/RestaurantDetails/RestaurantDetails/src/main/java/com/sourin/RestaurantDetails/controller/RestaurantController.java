package com.sourin.RestaurantDetails.controller;

import com.sourin.RestaurantDetails.entity.Restaurant;
import com.sourin.RestaurantDetails.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;


    @PostMapping("add")
    public String addRestaurants(@RequestBody List<Restaurant> restaurants){
        return restaurantService.addRestaurants(restaurants);
    }
    @GetMapping("restaurants")
    public List<Restaurant> RestaurantsListGet(){
        return restaurantService.RestaurantsListGet();
    }
    @GetMapping("rid/{id}")
    public List<Restaurant> RestaurantsListGetById(@PathVariable Integer id){
        return restaurantService.RestaurantsListGetById(id);
    }
    @PutMapping("id/{id}/number/{num}")
    public String RestaurantsListUpdateById(@PathVariable Integer id,@PathVariable Integer num){
        return restaurantService.RestaurantsListUpdateById(id,num);
    }
    @DeleteMapping("restaurants/{id}")
    public String RestaurantsDelete(@PathVariable Integer id){
        return restaurantService.RestaurantsDelete(id);
    }

    @PostMapping("add/one")
    public String addRest(@RequestBody Restaurant rest){
        return restaurantService.addRest(rest);
    }
}
