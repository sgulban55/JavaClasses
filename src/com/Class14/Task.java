package com.Class14;

public class Task {
	
	public static void main (String[] args) {
		
		/* Create a String and if the String is not empty perform the following:
		 * if the String has an odd number of characters and has 3 or more characters,
		 * print the character in the middle of the String
		 */
		
		String str2 = "Hellou”;
        
	       if (!str2.isEmpty()) {
	           if (str2.length() % 2  != 0) {
	               System.out.print(str2.charAt(str2.length()/2));
	           }else {
	           System.err.println("Error”);
	       }
	        
	        
	       }
	}
}

