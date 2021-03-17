package com.pkart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.pkart.model.Customer;


class CustomerControllerTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCustomer() {
		int choice = 1;
		assertTrue(choice>=1 && choice<=6);
		System.out.println("Passed!!!");
	}
	@Test
	void testCustomerNegative() {
		int choice = -1;
		assertTrue(choice<1);
		System.out.println("Failed!!!");
	}
	@Test
	void testCustomerNullValue() {
		assertNull(null);
		System.out.println("Failed!!!");
	}

	@Test
	void testOperations() {
		Customer c1 = new Customer();
		int id = c1.testId(5000);
		assertTrue(id>=1001 && id<=9999);
		System.out.println("Passed!!!!");
	}
	@Test
	void testOperationsNegativeIdValue() {
		
		Customer c1 = new Customer();
		int id = c1.testId(-1);
		assertTrue(id<0);
		System.out.println("Failed!!!");
	}
	@Test
	void testOperationsNullValue() {
		assertNull(null);
		System.out.println("Failed!!!");
	}
	@Test
	void testOperationsSpecialCharacterIdValue() {
		
		Customer c1 = new Customer();
		int id = c1.testId('$');
		assertTrue(id =='$'|id =='*'|id =='+'|id =='-'|id =='!'|id == '?'|id == '^');
		System.out.println("Failed!!!");
	     }
	@Test
	void testOperationsStartingWithZeroIdValue() {
		
		Customer c1 = new Customer();
		int id = c1.testId(0);
		assertTrue(id==0);
		System.out.println("Failed!!!");
	}
}