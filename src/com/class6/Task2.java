package com.class6;

import java.util.Scanner;

public class Task2 {
	
	public static void main (String[] args) {
		
		/* ask user to enter boolean value for sale
		 * if no sale ---> I am not shopping
		 * if sale ---> check the price of the item
		 * based on the amount we will have to calculate the price after discount
		 * if price <20 ---> apply 10% discount
		 * if price between 20-100 ---> 20% discount
		 * if between 100-500 ---> 30% discount
		 * anything ---> 50% discount
		 * 
		 * after discount ___ the price of the item reduced from ___ to ___
		 */
		
		
		Scanner inp = new Scanner(System.in);
		System.out.println("Is there a sale? True or False");
		boolean sale = inp.nextBoolean();
		
		
	    double discount;
		double finalPrice;
		double price;
		
		if (!sale) {
			System.out.println("I am not shopping");
		}else {
			System.out.println("What is the actual price?");
			price = inp.nextDouble();
			
		if (price<20) {
			discount = price *0.10;
			//finalPrice = price - discount;
		} else if (price>=20 && price<=100) {
			discount = price *0.20;
			//finalPrice = price - discount;
		} else if (price>=100 && price<=500) {
			discount = price *0.30;
			//finalPrice = price - discount;
		} else {
			discount = price *0.50;
			
			
		}
		 finalPrice = price - discount;
			
System.out.println("After discount "+discount+" the price of the item reduce from "+price+" to "+finalPrice);
			
		}
		
	}
}


