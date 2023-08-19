package com.example.caseStudy.repos;

import com.example.caseStudy.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {
}
