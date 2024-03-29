package com.ecommerceapp.ecommerce.dao;

import com.ecommerceapp.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
