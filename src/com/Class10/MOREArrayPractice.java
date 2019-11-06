package com.Class10;

public class MOREArrayPractice {
	
	public static void main (String[] args) {
		
		// Create an array to store 5 double values, print all in 1 line
		
		double [] values = {1.1, 1.2, 1.3, 1.4, 1.5};
		double size = values.length;
		
		for (int i=0; i<size; i++) {
			System.out.print(values[i]+","+" ");
			
		}
	}

}
