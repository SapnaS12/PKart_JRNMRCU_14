package com.pkart.service;

import java.util.List;

import com.pkart.model.Product;

public interface IProductService {

	
	 boolean addProduct(Product product);

	 boolean removeProduct(Product product);

	 void updateProduct(int id1, Product product);
	
	 Product viewProduct(int productId);

	 public List<Product> viewAllProduct();

	
}
