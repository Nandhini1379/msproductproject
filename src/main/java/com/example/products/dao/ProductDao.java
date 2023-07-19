package com.example.products.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.products.entity.ProductEntity;
import com.example.products.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository proRepo;
	
	public String setProduct(ProductEntity p) {
		proRepo.save(p);
		return "SuccessFully Added";
	}
	public String setAllProduct(List<ProductEntity> p) {
		proRepo.saveAll(p);
		return "SuccessFully added";
	}
	public ProductEntity getProductById(int id) {
		return proRepo.findById(id).get();
	}
	public List<ProductEntity> getAllProduct(){
		return proRepo.findAll();
	}
	
	

}
