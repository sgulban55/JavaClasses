package com.Class10;

public class AllValuesFromArray {
	
	public static void main (String[] args) {
		
		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		int a=2;
		System.out.println(grades[4]);//E
		System.out.println(grades[a]);//C
		
		a+=2;//2+2
		System.out.println(grades[a]);//E
		a--;//3
		System.out.println(grades[a]);//D
		
		System.out.println(grades[0]);//A
		System.out.println(grades[1]);//B
		System.out.println(grades[2]);//C
		System.out.println(grades[3]);//D
		
		for (int i=0; i<grades.length; i++) {
			System.out.println(grades[i]);//A, B, C, D, E, F
			
			
		String [] animals = {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		int size = animals.length;
		
		for (int s=0; s<size; s++) {
			System.out.print(animals[s]+" ");
			
		
		String [] animal = {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		for (int t=0; t<animal.length; t++) {
			if (animal[t].equals("Dog")) {//compares a string to another string
				System.out.println("I love dogs");
			} else {
				System.out.println(animal[t]);
				
		//Create an array of countries. While retrieving all values from an array print capital for each country.
				
		String [] countries = {"Afghanistan", "Bolivia", "Turkey", "India", "China"};
		
						for (int c = 0; c < countries.length; c++) {
							if (countries[c].equals("Afghanistan")) {
								System.out.println("Kabul");
							} else if (countries[c].equals("Bolivia")) {
								System.out.println("Sucre");
							} else if (countries[c].equals("Turkey")) {
								System.out.println("Istanbul");
							} else if (countries[c].equals("India")) {
								System.out.println("New Delhi");
							} else if (countries[c].equals("China")) {
								System.out.println("Beijing");
							}
						}
					}
				}
			}
		}
	}

}
