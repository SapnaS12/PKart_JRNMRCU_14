package com.pkart.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pkart.model.*;

public class CustomerDaoImpl implements ICustomerDao{
	private static Map<Integer, Customer> customers;

	public CustomerDaoImpl() {

		if (null == customers) {
			customers = new HashMap<>();
		}

	}

	@Override
	public boolean viewOrder(Customer customer) {
		return false;
	}

	@Override
	public boolean purchasePoduct(Customer customer) {
		return false;
	}

	@Override
	public void orderDetails(int customerId) {
		
	}

	@Override
	public List<Customer> viewCart() {
		return null;
	}

	@Override
	public Customer viewCustomer(int id) {
		
		return customers.get(new Integer(id));
		
		
	}

	@Override
	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}
	public ArrayList<Product> purchaseProduct() {
		ArrayList<Product> productlist = new ArrayList<>();
		Product p1 = new Product(1,"Soap", 1200.00d, 1, "12-09-2021", "09-12-2023");
		productlist.add(p1);
		Product p2 = new Product(2,"BournVita", 350.00, 1, "07-10-2017", "09-11-2021");
		productlist.add(p2);
		Product p3 = new Product(3,"Almond", 958.00, 1, "06-09-2019", "12-12-2021");
		productlist.add(p3);
		Product p4 = new Product(4,"Brush", 75.00, 1, "11-06-2018", "09-11-2022");
		productlist.add(p4);
		Product p5 = new Product(5,"Mobile", 20000.00, 1, "11-06-2018", "09-01-2026");
		productlist.add(p5);
		Product p6 = new Product(6,"Charger", 750.00, 1, "15-06-2018", "09-10-2022");
		productlist.add(p6);
		return productlist;
	}

}