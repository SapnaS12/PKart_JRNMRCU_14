package com.pkart.service;

import java.util.ArrayList;

import com.pkart.model.*;

public interface ICartService {

	boolean addToCart(Product product);
	
	ArrayList<Product> viewCart();
}

