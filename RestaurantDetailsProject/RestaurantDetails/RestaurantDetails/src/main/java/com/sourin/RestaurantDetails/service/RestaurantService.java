package com.sourin.RestaurantDetails.service;

import com.sourin.RestaurantDetails.entity.Restaurant;
import com.sourin.RestaurantDetails.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;
    public List<Restaurant> RestaurantsListGet() {
        return restaurantRepo.getRestaurantList();
    }
    public String addRestaurants(List<Restaurant> restaurants) {
        List<Restaurant> orginalList=RestaurantsListGet();
        orginalList.addAll(restaurants);

        return "add done";
    }



    public List<Restaurant> RestaurantsListGetById(Integer id) {
        List<Restaurant> orginalList=RestaurantsListGet();

        for(Restaurant r:orginalList){
            if(r.getId()==id){
                List<Restaurant> byId=new ArrayList<>();
                byId.add(r);

                return byId;
            }
        }

        return null;
    }

    public String RestaurantsListUpdateById(Integer id, Integer num) {
        List<Restaurant> orginalList=RestaurantsListGet();

        for(Restaurant r:orginalList){
            if(r.getId()==id){
                r.setNumber(num);
                return "Update done with id : "+id;
            }
        }
        return "Update not done  id not valid : "+id;

    }

    public String RestaurantsDelete(Integer id) {
        List<Restaurant> orginalList=RestaurantsListGet();

        for(Restaurant r:orginalList){
            if(r.getId()==id){
                orginalList.remove(r);
                return "Delete Done with id : " +id;
            }
        }
        return "Delete not Done with id not found : " +id;
    }


    public String addRest(Restaurant rest) {
        List<Restaurant> orginalList=RestaurantsListGet();
        orginalList.add(rest);

        return "add done";
    }
}
