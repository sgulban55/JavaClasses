package com.Class7;

import java.util.Scanner;

public class Homework {

	/*
	 * You need to ask user to pay for coffee You need to keep asking user to pay
	 * for it until entered price is equal =5 After user paid then say
	 * "Enjoy your coffee!"
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int price;

		do {
			System.out.println("Please pay for your coffee");
			price = scan.nextInt();

		} while (price != 5); //no increment needed e.g c++;

		System.out.println("Enjoy your coffee!"); 

		int price1;
		System.out.println("Please pay for your coffee");
		price1 = scan.nextInt();

		while (price1 != 5) {
			System.out.println("Please pay for your coffee");
			price1 = scan.nextInt(); //you have to put repetitive action

		}

	}

}
