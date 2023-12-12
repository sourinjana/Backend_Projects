package com.sourin.EmployeeAddress.controller.onetoone;

import com.sourin.EmployeeAddress.model.onetoone.Address;
import com.sourin.EmployeeAddress.model.onetoone.Employee;
import com.sourin.EmployeeAddress.service.onetoone.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {
   //Independent
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public void addAddress(@RequestBody Address address){
         addressService.addAddress(address);
    }


    @GetMapping("addresses")
    public Iterable<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("add/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }


    @DeleteMapping("add/{id}")
    public String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }

    @PutMapping("id/{id}/zip/{zip}")
    public String updateZipCodeById(@PathVariable String zip,@PathVariable Long id){
        return addressService.updateZipCodeById(zip,id);
    }



}
