package com.sourin.EcommerceApp.repository;

import com.sourin.EcommerceApp.model.Category;
import com.sourin.EcommerceApp.model.Product;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {


      //@Query(value = "select * from product where product_category= :category",nativeQuery = true)
      List<Product> findAllProductByProductCategory(Category category);
}
