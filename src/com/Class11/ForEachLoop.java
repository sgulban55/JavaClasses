package com.Class11;

public class ForEachLoop {

	public static void main(String[] args) {
		// Auto-generated method stub
		
		int [] numbersList = {12, 14, 15, 16};
		
		for (int elements : numbersList)
			System.out.println(elements);
		
		//task
		// create an array of cars and store 6 elements into it
		//using 2 different loops print all values from the array
		
		String[] cars = { "BMW", "VW", "Mercedes", "Toyota", "Honda", "GTR" };

		for (int i = 0; i < cars.length; i++) {
			System.out.print(cars[i] + " ");

			for (String car : cars) {
				System.out.print(car + " ");

				// task 2
				// create an array on integers and calculate the sum of all elements in an array

				int[] array = { 1, 2, 3, 4, 5 };
				int sum = 0;
				for (int a = 0; a < array.length; a++) {
					System.out.println(sum = sum + array[a]);
			
		//task 3
		//Create an array of countries
		//While retrieving all values from an array print capital for each country. (use 2 different loops)
			
					String[] countries = { "Afghanistan", "Turkey", "India" };

					for (int q = 0; q < countries.length; q++) {
						if (countries[q].equals("Afghanistan")) {
							System.out.println("The capital is Kabul");
						} else if (countries[q].equals("Turkey")) {
							System.out.println("The capital is Istanbul");
						} else if (countries[q].equals("India")) {
							System.out.println("The capital is New Delhi");
						}
						
						//OR
						
					String [] countrys = {"Afghanistan", "Turkey", "India"};
					
					for (String getCountry : countrys) {
						if (getCountry.equals("Afghanistan")) {
							System.out.println("The capital of Afghanistan is Kabul");
						}
					}
			
		//another method using for each loop
			
						String[] country = { "Turkey", "Afghanistan", "Russia" };
						String[] capital = { "Ankara", "Kabul", "Moscow" };

						for (String x : country) {

							switch (x) {

							case "Turkey":
								System.out.println(capital[0]);
								break;
							case "Afghanistan":
								System.out.println(capital[1]);
								break;
							case "Russia":
								System.out.println(capital[2]);
								break;
							default:
								break;
							}
						}
					}
				}
			}
		}
	}
}
