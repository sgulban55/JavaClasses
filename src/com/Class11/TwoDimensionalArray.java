package com.Class11;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		
		//task
		//create 2D array of String with 2 rows and 3 columns
		//print value in second row and 3rd column
		
		String [][] array = new String [2] [3];
		
		array [0] [0] = "Shugofa";
		array [0] [1] = "Shubha";
		array [0] [2] = "Fabi";
		
		array [1] [0] = "Lisa";
		array [1] [1] = "Omed";
		array [1] [2] = "Rahul";
		
		System.out.println(array [1][2]);
		
		//to print them all
		
		for (int i=0; i<2; i++) { //row
			for (int j=0; j<3; j++) { //column
				System.out.println(array[i][j]);			
			}
			System.out.println();
		}
		
		//another way
		
		int [][] numbers = {
				{3, 4, 5, 6, 7, 9, 8, 7},
				{4, 5, 6, 7, 8, 9, 9},
				{5, 6, 7, 8, 9, 9, 9},
				{6, 7, 8, 9, 10, 8, 9}	
		};
		System.out.println("The value in index 1 and 4 is= " + numbers[1][4]); //

		System.out.println("The number of rows are:= " + numbers.length);// to identify the number of Rows

		System.out.println("The number of columns are:= " + numbers[3].length);// to identify the number of Columns

		for (int s = 0; s < numbers.length; s++) {
			for (int p = 0; p < numbers[s].length; p++) {
				System.out.print(numbers[s][p] + " ");
			}
			System.out.println();
		}
	}

}
