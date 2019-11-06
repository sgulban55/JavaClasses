package com.Class8;

public class ForLoop {
	
	public static void main (String[] args) {
		
		// Say good morning 5 times
		//initialize;      test condition;     increment;
		for (int i = 0;       i <= 4;            i++) {
			System.out.println("Good morning");
		}
		
		
		//print numbers 1-10;
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		//print numbers 10-1;
		
		for (int i = 10; i >=1; i--) {
			System.out.println(i);
		}
		
		for (int i = 0; i <=50; i+=5) {
			System.out.print(i+" "); //output = 5, 10, 15, 20...
		}
		
		
	}

}
