package com.sourin.EmployeeAddress.repository.onetoone;

import com.sourin.EmployeeAddress.model.onetoone.Address;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAddressRepo extends CrudRepository<Address,Long> {

    @Modifying
    @Transactional
    @Query(value = "update address set zipcode = :zipcode where add_id= :id",nativeQuery = true)
    void updateZipCodeById(String zipcode,Long id);


}
