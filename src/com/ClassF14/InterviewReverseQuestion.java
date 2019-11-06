package com.ClassF14;

public class InterviewReverseQuestion {

	public static void main(String[] args) {
		
		//write a java program to reverse String
		//reverse a string word by word
		
		String str = "String";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			
			System.out.println("***************");

			String str1 = "Hello my name is Shubha";

			for (int e = str1.length() - 1; e >= 0; e--) {
				System.out.println(str1.charAt(e));
			}
		}
	}
}
