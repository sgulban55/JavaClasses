package com.ClassF14;

public class StringManipulationRecap {
	
	public static void main (String[] args) {
		

		//String is immutable..
		
		String str = new String("Hello");
		System.out.println(str);
		String str2 = str.replaceAll("Hello", "Bye");
		System.out.println(str2);
		
		//equal equal method ---> to compare two references
		//equal method ---> 
		//asks if the reference object is pointing to the same object or not
		
		String str7 = new String("Hello");
		String str9 = new String("Hello");
		System.out.println(str7==str9); //will print false
		
		//^^^^^to make this equal you simply reassign the variable
		
		String s1 = "Bye";
		String s2 = "Bye";
		System.out.println(s1==s2); //will print true
		
		//.replace
		String str4 = "your Syntax Technologies. is your place to study";
		System.out.println(str4.replace('y', 'i'));
		System.out.println(str4.replace("your", "My"));
		
		//.replaceAll
		String str5 = "32143H  e8908llo78&*^%$93";
		System.out.println(str5.replaceAll("[0-9]", "")); //will only print hello
		System.out.println(str5.replaceAll("[^A-z]", ""));
		
		//.replaceFirst
		System.out.println(str5.replaceFirst(" ", "")); //removes first space with nothing
	
		
	}

}
