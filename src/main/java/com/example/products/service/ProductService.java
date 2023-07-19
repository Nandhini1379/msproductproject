package com.example.products.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.products.dao.ProductDao;
import com.example.products.entity.ProductEntity;

@Service
public class ProductService {
	@Autowired
	ProductDao proDao;
	
	public String setProduct(ProductEntity p) {
		return proDao.setProduct(p);
	}
	public String setAllProduct(List<ProductEntity> p) {
		return proDao.setAllProduct(p);
	}
	public ProductEntity getProductById(int id) {
		return proDao.getProductById(id);
	}
	public List<ProductEntity> getAllProduct(){
		return proDao.getAllProduct();
	}

}
