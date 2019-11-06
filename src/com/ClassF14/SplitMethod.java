package com.ClassF14;

public class SplitMethod {

	public static void main (String[] args) {
		
		//.split()
		//This method splits this string around matches of the given regular expression
		
		String str = "Video provides a powerful way to help you prove your point.";
		
		String [] array = str.split(" ");
		
		for (int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		
		//method to find how many sentences are there in the following string
		
		String str1 = "Today it is Sunday. It's a sunny day. We are having Java class";
		
		String [] array2 = str1.split("\\.");
		
//		for (String string : array2) {
//			System.out.println(string.trim());
			
		//or
			
		String [] array3 = str1.split("\\.");
		System.out.println("The number of sentences in the given String is: "+array3.length);
		}
	}
