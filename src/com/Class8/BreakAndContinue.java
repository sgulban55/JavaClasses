package com.Class8;

import java.util.Scanner;

public class BreakAndContinue {

	public static void main(String[] args) {
		
		//break keyword ---> breaks/exit's the loop
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;//0,1,2,3,4,"I am outside of the loop"
			}

			System.out.println(i);

		}

		System.out.println("I am outside of the loop");
		System.out.println("*************************");
		//continue keyword ---> it will skip current iteration
		
		for (int a = 1; a <= 5; a++) {
			if (a == 3) {
				continue;// 1,2,4,5,"I am outside of the loop"
			}
			System.out.println(a);
		}
		
		System.out.println("I am outside of the loop");
		System.out.println("*************************");
		//I want to print 1 to 20 except 5, 6, 7
	
	for(int b = 1;b<=20;b++) {

		if (b == 5 || b == 6 || b == 7) {
			continue;
		}
		System.out.println(b);
		
	}
	System.out.println("*************************");
	
	//print numbers from 1 to 50 except those that are divisible by 3
	
	for (int k=1; k<=50; k++) {
		if (k%3==0) {
			System.out.println(k);
			continue;
		}
	
	}
	
		// create a program that will be asking a user to apply for a cc 10 times
		//as soon as you get a "yes" from a user program should stop asking
	
	
	String card;
	Scanner scan = new Scanner(System.in);
	
	for (int q=1; q<=10; q++) {
		System.out.println("Are you going to apply for a credit card?");
		card = scan.nextLine();
		if (card.equalsIgnoreCase("Yes")) {
			break;
		}
	
	}

}
}