package com.Class10;

public class ArrayUsingSwitch {

	public static void main(String[] args) {
		
		String [] countries = {"Afghanistan", "Bolivia", "Turkey", "India", "China"};
		String capital = null;
		for (int c = 0; c < countries.length; c++) {
			switch (countries[c]) {

			case "Afghanistan":
				System.out.println("Kabul");
				break;
			case "Bolivia":
				System.out.println("Sucre");
				break;
			case "Turkey":
				System.out.println("Istanbul");
				break;
			case "India":
				System.out.println("New Delhi");
				break;
			case "China":
				System.out.println("Beijing");
				break;

			}
		}
	}
}
