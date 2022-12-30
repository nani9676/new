package com.microservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservice.Model.Product;
import com.microservice.Service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
    private RestTemplate restTemplate;
	
	@PostMapping("/save")
	public ResponseEntity<Product> saveProduct(@RequestBody Product product){
	Product saveproduct=productService.saveProductDetails(product);
	return new ResponseEntity<>(saveproduct,HttpStatus.CREATED);
	}
	
	@GetMapping("/findall")
	public ResponseEntity<Product> findAllProducts(){
		List<Product> listAllProducts=productService.findAllProductDetails();
		return new ResponseEntity(listAllProducts,HttpStatus.OK);
	}
	
	

	@GetMapping("/empleedata")
	public Object[] apigetData(){
	Object[] products=restTemplate.getForObject("http://api-gateway/customer/findall", Object[].class);
	return products;
	}

	

}
