package com.sourin.EcommerceApp.controller;

import com.sourin.EcommerceApp.model.Address;
import com.sourin.EcommerceApp.model.Category;
import com.sourin.EcommerceApp.model.Product;
import com.sourin.EcommerceApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("product")
    public String addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("products/{category}")
    public List<Product> getAllProductsByCategory(@PathVariable Category category){
        return productService.getAllProductsByCategory(category);
    }

    @DeleteMapping("product/{id}")
    public String deleteProductById(@PathVariable Integer id){
        return productService.deleteProductById(id);
    }
}
