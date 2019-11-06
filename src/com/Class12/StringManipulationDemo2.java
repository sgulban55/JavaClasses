package com.Class12;

public class StringManipulationDemo2 {
	
	public static void main (String[] args) {
		
		//7. String.contains()
		//method to compare two things
		//case sensitive
		
		String sentence = "It was raining";
		System.out.println(sentence.contains("was"));
		//answer = true
		
		String wording = "It was sunny";
		String word = "today";
		
		System.err.println(word.contains(wording));
		System.err.println(wording.contains(word));
		
		//task
		//create two strings and initialize them with a value
		//implement the following methods on those strings
		
		/* sen.length
		 * sen.equals
		 * sen.contains()
		 * sen.toUpperCase
		 * sen.toLowerCase
		 * sen.equalsIgnoreCase()
		 */
		
	}

}
