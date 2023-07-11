package com.example.dockerAssesment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dockerAssesment.dto.Product;
import com.example.dockerAssesment.service.ProductServices;
@RestController
@RequestMapping("/myService")
public class ServiceControllers {
	@Autowired
	ProductServices productServices;
	@PostMapping("/saveProduct")
	public String saveProduct(@RequestBody Product product) {
		return productServices.saveInventory(product);
	}
	@GetMapping("/hello")
	public String apiHealth() {
		return "Hi service is there";
	}
}
