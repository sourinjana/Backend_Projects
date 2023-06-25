package com.sourin.RestaurantDetails.beanfactory;

import com.sourin.RestaurantDetails.entity.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class RestaurantBeanList {

    @Bean
    public List<Restaurant> getList(){
        return new ArrayList<>();
    }
}
