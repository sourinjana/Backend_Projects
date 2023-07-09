package com.sourin.EcommerceApp.controller;

import com.sourin.EcommerceApp.model.MyOrder;
import com.sourin.EcommerceApp.service.MyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MyOrderController {

    @Autowired
    MyOrderService myOrderService;
    @PostMapping("order")
    public String addOrder(@RequestBody MyOrder myorder){
        return myOrderService.addOrder(myorder);
    }

    @GetMapping("orders")
    public List<MyOrder> getAllOrder(){
        return myOrderService.getAllOrder();
    }

    @GetMapping("order/{id}")
    public Optional<MyOrder> getOrderById(@PathVariable Integer id){
        return myOrderService.getOrderById(id);
    }

    @DeleteMapping("order/{id}")
    public String deleteOrderById(@PathVariable Integer id){
        return myOrderService.deleteOrderById(id);
    }

}
