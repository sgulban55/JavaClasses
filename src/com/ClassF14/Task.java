package com.ClassF14;

public class Task {

	public static void main(String[] args) {

		// 1) Create a string that will hold a sentence. Write a program, to get a new string without any spaces
		
		// 2) Create a String that should be combination of letters, numbers and special characters. 
		//Find out how many alpha characters are there in the String.
		
		// 3) You have a String a=”Is it Saturday? Is it raining? Do we have a Java Class today?” 
		//How would you find out how many sentences are in that String?
		
		String str = "Hello how are you?";
		System.out.println(str.replaceAll("\\s", ""));
		
		System.out.println("*******************");

		String a = "4252*(*hello90906";
        System.out.println(a.replaceAll("[^a-zA-Z0-9]",""));
        String b = (a.replaceAll("[^a-zA-Z0-9]",""));
        System.out.println(b.length());
		
		System.out.println("*******************");

		String c = "Is it saturday? Is it raining? Do we have a Java Class today?";

		String[] array = c.split("\\?");
		System.out.println("The number of sentences in the given String is: "+array.length);
		
		}
	}
