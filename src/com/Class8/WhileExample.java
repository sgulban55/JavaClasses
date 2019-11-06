package com.Class8;

import java.util.Scanner;

public class WhileExample {
	
	public static void main (String [] args) {
		
		/* lets ask user to enter if it is raining or not raining (true or false)
		 * as long as there is rain let's keep asking
		 * as soon as there is no rain ---> you can go to the park
		 */
		
		Scanner scan;
		scan = new Scanner(System.in);
		boolean isRain;
		
		do {
			System.out.println("Is it raining? True or False");
			isRain = scan.nextBoolean();
			
		} while (isRain);
		
		System.out.println("Go to the park");
		}
	}

