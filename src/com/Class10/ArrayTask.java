package com.Class10;

public class ArrayTask {
	
	public static void main (String[] args) {
		
		// Create an array of names and store all names of your group.
		// Then print your name from that array. (use 2 different ways of creating an array).
		
		String[] names = {"Shugofa", "Fabi", "Rahul"};
		System.out.println(names[0]);
		
		// Create an array of words: Java, Saturday, day, coding, is.
		// Print the following sentence using element of array: “Saturday is Java coding Day”.
		
		String [] words = new String [5];
		words [0] = "Java";
		words [1] = "Saturday";
		words [2] = "day";
		words [3] = "coding";
		words [4] = "is";
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
				
}
}
