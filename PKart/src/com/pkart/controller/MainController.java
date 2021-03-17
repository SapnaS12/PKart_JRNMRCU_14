package com.pkart.controller;

import java.util.Scanner;

import com.pkart.util.InputUtil;

public class MainController {
	public static void main(String[] args) {

		runApplication();

	}

       static void runApplication() {

		Scanner scanner = InputUtil.getScanner();
		System.out.println("------WELCOME TO PKart-------");
		System.out.println("1. Admin \n 2.Customer \n 3.Exit");

		System.out.println("Enter your choice:");
		int choice = scanner.nextInt();

		switch (choice) {

		case 1:
			AdminController productController = new AdminController();   
			productController.operations();   // Calling Admin Controller
			break;
			
		case 2:
			CustomerController customerController = new CustomerController();  
			customerController.operations();    // Calling Customer Controller
			break;

		
            
		case 3:
			System.out.println("logout..!");
			System.exit(1);
		}

	}
}

