package com.ClassF14;

public class ToCharArrayMethod {

	public static void main(String[] args) {
		
		//This method converts this string to a new character array
		
		String str = "Syntax";

		char[] array = str.toCharArray();

		for (char i : array) {
			System.out.println(i);
		}

	}

}
