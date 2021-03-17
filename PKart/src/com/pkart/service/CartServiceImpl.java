package com.pkart.service;

import java.util.ArrayList;

import com.pkart.dao.CartDaoImp;
import com.pkart.dao.ICartDao;
import com.pkart.model.Product;

public class CartServiceImpl implements ICartService{
	private static ICartDao cartDao;

	public CartServiceImpl() {

		if (null == cartDao)
			cartDao =  new CartDaoImp();

	}

	@Override
	public  boolean addToCart(Product product) {
		cartDao.addToCart(product);
		ArrayList<Product> savedProduct = cartDao.viewCart();

		if (savedProduct != null)
			return true;
		else
			return false;


	}

	@Override
	public ArrayList<Product> viewCart() {
		return cartDao.viewCart();
		
	}

}
