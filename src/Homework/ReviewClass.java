package Homework;

import java.util.Scanner;

public class ReviewClass {

	public static void main (String[] args) {
		
		/* Create a Java program that will ask if user has a credit card or not
         * If user does not have a credit card then offer them. If they do have 
        one ask what is balance on the card? 
        * If balance of the card is larger than 1000, tell them to pay off
        * otherwise you can tell them that they can spend more
         */
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Do you have a credit card? True or False");
		boolean cc=keyboard.nextBoolean();
		
		Scanner a = new Scanner(System.in);
		int b =a nextInt();
		
		if (cc==true) {
			System.out.println("What is the balance on the card?");
		} if (a>1000) {
			System.out.println("Pay off credit card");
		} else {
			System.out.println("You can spend more money");
		} else {
			System.out.println("Would you like to apply for a credit card?");

		}
	
	}	
	}

