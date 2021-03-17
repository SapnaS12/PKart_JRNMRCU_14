package com.pkart.dao;

import java.util.List;

import com.pkart.model.Product;

public interface IProductDao {

	     
	void addProduct(Product product);

	 void removeProduct(Product product);

	 void updateProduct(int id, Product product);
	
	 Product viewProduct(int productId);
	

	 List<Product> viewAllProduct();

}
