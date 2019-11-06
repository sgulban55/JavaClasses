package com.Class13;

public class TwoDimensionalReviewClass {

	public static void main(String[] args) {
		
		int [][] b = {
				{7, 3, 5},
				{6, 5, 4, 9, 8},
				{9, 8, 7},
				{7, 5, 4}
		};
		
		for (int i=0; i<b.length; i++) {
			for (int j=0; j<b[i].length; j++) {
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		

}
	}
}
