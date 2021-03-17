package com.pkart.dao;

import java.util.ArrayList;

import com.pkart.model.Product;

public interface ICartDao {
	void addToCart(Product product);
	ArrayList<com.pkart.model.Product> viewCart();

}

