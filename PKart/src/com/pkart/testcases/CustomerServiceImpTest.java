package com.pkart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pkart.model.Customer;
import com.pkart.service.CustomerServiceImpl;

class CustomerServiceImpTest {
      private CustomerServiceImpl customerServiceImp;
	@BeforeEach
	void setUp() throws Exception {
		 customerServiceImp = new CustomerServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		customerServiceImp =null;
	}

	@Test
	void testAddCustomer() {
			Customer customer =new Customer(101, "John","jh1@gmail.com", "12345789654", "Delhi");
		    boolean result = customerServiceImp.addCustomer(customer);
		    assertEquals(true, result);
		}
	}

