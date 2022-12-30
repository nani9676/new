package com.microservice.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.Model.Product;
import com.microservice.Repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public Product saveProductDetails(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	public List<Product> findAllProductDetails() {
		// TODO Auto-generated method stub
		List<Product> allproducts=	productRepository.findAll();
		return allproducts;
	}

}
