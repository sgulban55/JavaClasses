package com.Class11;

import java.util.Arrays;

public class ArrayManipulation {

	public static void main(String[] args) {
		
		String [] actualNames = {"Shugofa", "Shubha", "Gunay", "Fabi"};
		Arrays.sort(actualNames);
		String [] expectedNames = {"Sara", "Ehsan", "Rohit", "Omed"};
		Arrays.sort(expectedNames); //puts the names in alphabetical order by picking up index #
		
		System.out.println(Arrays.toString(actualNames));
		
		
		String actual = Arrays.toString(actualNames);
		String expected = Arrays.toString(expectedNames);
		
		System.out.println(actual.equals(expected));
		
		String firstName = "Pari";
		String secondName = "Gulban";
	}

}
