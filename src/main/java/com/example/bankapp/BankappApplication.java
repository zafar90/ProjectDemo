package com.example.bankapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankappApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankappApplication.class, args);

		 String nullString = null; 
		 System.out.println('nullString.length()');

		 String password = "abcd";
		 System.out.println("Password" + password); 

	}

}
