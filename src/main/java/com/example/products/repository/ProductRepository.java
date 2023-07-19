package com.example.products.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.products.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

}
