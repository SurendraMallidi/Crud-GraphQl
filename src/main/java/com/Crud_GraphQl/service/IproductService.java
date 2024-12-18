package com.Crud_GraphQl.service;

import com.Crud_GraphQl.model.Product;

public interface IproductService {
	
	public Product addProduct(Product product);
	public Product getProduct(Integer id);
}
