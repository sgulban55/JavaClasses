package com.Class7;

import java.util.Scanner;

public class home {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Do you have a credit card? True or False");

		boolean cc = scan.nextBoolean();

		if (cc) {
			System.out.println("What is the balance on your card?");
			int balance = scan.nextInt();
		
		if (balance > 1000) {
			System.out.println("Please pay off your balance");
		} else {
			System.out.println("You can spend more money");
		}

	}else {
			System.out.println("Would you like to apply for a credit card?");
		
	}
	}
}

				  
	
