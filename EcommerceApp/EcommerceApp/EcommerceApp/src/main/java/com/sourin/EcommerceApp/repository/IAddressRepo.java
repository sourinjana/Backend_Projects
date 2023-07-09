package com.sourin.EcommerceApp.repository;

import com.sourin.EcommerceApp.model.Address;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Integer> {
    @Modifying
    @Transactional
     @Query(value = "update address set fk_user_id= :key where address_id= :id",nativeQuery = true)
    void updateFkUserId(Integer key,Integer id);
}
