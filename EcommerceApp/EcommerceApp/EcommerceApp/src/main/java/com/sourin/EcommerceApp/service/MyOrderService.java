package com.sourin.EcommerceApp.service;

import com.sourin.EcommerceApp.model.MyOrder;
import com.sourin.EcommerceApp.repository.IMyOrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MyOrderService {

    @Autowired
    IMyOrderRepo orderRepo;

    public String addOrder(MyOrder myorder) {

        orderRepo.save(myorder);
        return "add done";
    }

    public List<MyOrder> getAllOrder() {
        return orderRepo.findAll();
    }

    public Optional<MyOrder> getOrderById(Integer id) {
       return orderRepo.findById(id);
    }

    public String deleteOrderById(Integer id) {

        orderRepo.deleteById(id);
        return "delete done";
    }
}
