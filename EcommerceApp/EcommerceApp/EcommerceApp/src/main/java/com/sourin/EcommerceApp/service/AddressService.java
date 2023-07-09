package com.sourin.EcommerceApp.service;

import com.sourin.EcommerceApp.model.Address;
import com.sourin.EcommerceApp.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public String addAddress(Address address) {
        addressRepo.save(address);

        return "add address";
    }

    public String updateFkKey(Integer key,Integer id) {
        addressRepo.updateFkUserId(key,id);
        return "update done";
    }
}
