package com.sourin.EcommerceApp.service;

import com.sourin.EcommerceApp.model.Category;
import com.sourin.EcommerceApp.model.Product;
import com.sourin.EcommerceApp.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    IProductRepo productRepo;

    public String addProduct(Product product) {

        productRepo.save(product);
        return "add done";
    }

    public List<Product> getAllProductsByCategory(Category category) {
        return productRepo.findAllProductByProductCategory(category);
    }

    public String deleteProductById(Integer id) {
        productRepo.deleteById(id);
        return "delete done";
    }
}
