package com.sourin.EmployeeAddress.service.onetoone;

import com.sourin.EmployeeAddress.model.onetoone.Address;
import com.sourin.EmployeeAddress.repository.onetoone.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public Iterable<Address> getAllAddress() {
        return addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {

        return addressRepo.findById(id);
    }

    public String deleteAddressById(Long id) {

        if (addressRepo.existsById(id)){
            addressRepo.deleteById(id);

            return "Address Delete";
        }

        return "Address Not delete Id not found";
    }

    public String updateZipCodeById(String zip,Long id) {

            addressRepo.updateZipCodeById(zip,id);

            return "update done";

    }
}
