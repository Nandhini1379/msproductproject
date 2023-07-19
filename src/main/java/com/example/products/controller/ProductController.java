package com.example.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.products.entity.ProductEntity;
import com.example.products.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService proSer;
	
	@PostMapping(value="/setProduct")
	public String setProduct(@RequestBody ProductEntity p) {
		return proSer.setProduct(p);
	}
	@PostMapping(value="/setAllProduct")
	public String setAllProduct(@RequestBody List<ProductEntity> p) {
		return proSer.setAllProduct(p);
	}
	@GetMapping(value="/getProductById/{id}")
	public ProductEntity getProductById(@PathVariable int id) {
		return proSer.getProductById(id);
	}
	@GetMapping(value="/getAllProduct")
	public List<ProductEntity> getAllProduct(){
		 return proSer.getAllProduct();
	}
	

}
