package com.Class12;

public class StringManipulation {

	public static void main(String[] args) {
		
		//1. String .length()
		//number of length is returned
		
		//literal String
		
		String name = "John";
		System.out.println(name.length());
		
		//new keyword
		
		String name1 = new String ("Shugofa");
		System.out.println(name1.length());
		
		//2. String.toLowerCase()
		//makes the capital letter lowercase
		
		String str = "Hello World";
		System.out.println(str);
		
		str = str.toLowerCase();
		System.out.println(str);
		
		//3. String.equals()
		//
		
		String str1 = "HeLlO WoRlD";
		
		boolean isEqual = str1.equals(str);
		System.out.println(isEqual);
		
		//4. String.equalsIgnoreCase()
		//doesn't care about the upper or lower case
		
		System.out.println(str1.equalsIgnoreCase(str));
		
		//5. String.toUpperCase
		//brings lowercase all to uppercase
		
		String str3 = "Mohammed";
		str3 = str3.toUpperCase();
		System.out.println(str3);
		

	}

}
