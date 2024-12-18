package com.Crud_GraphQl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;


import com.Crud_GraphQl.model.Product;
import com.Crud_GraphQl.service.ProductServiceImpl;

@Controller
public class ProductController {
	
	@Autowired
	private ProductServiceImpl service;
	
	
	public Product saveProduct(@RequestBody Product product) {
		
		return service.addProduct(product);
	}
	
	@QueryMapping
	public Product getProduct(@Argument Integer id) {
		
		return service.getProduct(id);
	}
}
