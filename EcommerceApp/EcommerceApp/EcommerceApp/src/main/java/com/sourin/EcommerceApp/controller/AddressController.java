package com.sourin.EcommerceApp.controller;

import com.sourin.EcommerceApp.model.Address;
import com.sourin.EcommerceApp.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;
     @PostMapping("address")
    public String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @PutMapping("key/{key}/id/{id}")
    public String updateFkKey(@PathVariable Integer key,@PathVariable Integer id){
        return addressService.updateFkKey(key,id);
    }


}
