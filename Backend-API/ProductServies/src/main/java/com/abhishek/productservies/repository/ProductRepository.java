package com.abhishek.productservies.repository;

import com.abhishek.productservies.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
