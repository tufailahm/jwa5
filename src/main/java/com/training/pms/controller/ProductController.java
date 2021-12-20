package com.training.pms.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.pms.model.Product;

@RestController
@RequestMapping("product")	//localhost:9090/product
public class ProductController {

	@PostMapping
	public String saveProduct(@RequestBody Product product) {
		System.out.println("Product data to be saved"+product);
		//code to save
		return "Product saved successfully";
	}
}
