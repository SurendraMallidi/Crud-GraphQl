package com.Crud_GraphQl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Crud_GraphQl.model.Product;
import com.Crud_GraphQl.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IproductService {
	
	@Autowired
	private ProductRepository repo;

	@Override
	public Product addProduct(Product product) {
		
		return repo.save(product);
		
	}

	@Override
	public Product getProduct(Integer id) {
		
		return repo.findById(id).orElseThrow();
	}

}
