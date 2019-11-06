package com.Class7;

public class DoWhile {
	
	public static void main (String[] args) {
		
		//out of "while" and "do"..."while" is used 99% of the time
		int num = 10;
		
		while (num <= 7) {
			System.out.println("Hello");
			num++;
			
		}
		
		//rare method to use
		int num1 = 10; //initialize the variable
		
		do {
			System.out.println("Bye"); //execute the code
			num1++; //increment
		} while (num1<=7); //check condition
		
		//even if the condition is false, it will execute the code at least once
		
		}
	
		//using DoWhile...print even numbers from 20 to 50
	
		int even = 60;
	
		do {
			System.out.println(even);
			even+=2;
		} while (even <= 50);
	
		
		//another way
		do {
			
		if (even%2 == 0) {
			System.out.println(even);
		}
			even++;
		} while (even<49);
			
		}


	}
