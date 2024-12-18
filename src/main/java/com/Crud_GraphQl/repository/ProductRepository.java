package com.Crud_GraphQl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Crud_GraphQl.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
