package com.sourin.EcommerceApp.repository;

import com.sourin.EcommerceApp.model.MyOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMyOrderRepo extends JpaRepository<MyOrder,Integer> {
}
