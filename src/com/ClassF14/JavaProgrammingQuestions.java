package com.ClassF14;

public class JavaProgrammingQuestions {
	
	public static void main (String[] args) {
		
		//Write a program to swap 2 numbers without a temporary variable? Swap 2 strings without a temporary variable
		
		int x = 10;
		int y = 20;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println(x);
		System.out.println(y);
		
		
		String a = "one";
		String b = "two";

		a = a + b;
		b = a.substring(0, (a.length() - b.length()));
		a = a.substring(b.length());

		System.out.println("a = " + a);
		System.out.println("b = " + b); 
	}
	
	

}
