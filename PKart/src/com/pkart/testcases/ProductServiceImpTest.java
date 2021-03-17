package com.pkart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pkart.model.Product;
import com.pkart.service.ProductServiceImpl;

class ProductServiceImpTest {
	private ProductServiceImpl productServiceImp;
  
	
	@BeforeEach
	void setUp() throws Exception {
		productServiceImp = new ProductServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAddProduct() {
		Product product =new Product(101, "Soap", 30, 1, "20/02/2019", "10/02/2021");
	    boolean result = productServiceImp.addProduct(product);
	    assertEquals(true, result);
	}

}
