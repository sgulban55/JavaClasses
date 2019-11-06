package com.Class9;

public class Pattern {
	
	public static void main (String[] args) {
		
		for (int k=1; k<=10; k++) { //outer loop controls rows
			for (int l=1; l<=10; l++) { //inner loop controls columns
				System.out.print("*");
			}
			System.out.println();
		}
		
		//print 
		/* 12345
		 * 12345
		 * 12345
		 * 12345
		 */
		
		for (int r=1; r<=5; r++) {
			for (int q=1; q<=5; q++) {
				System.out.print(q);
			}
			System.out.println();
	}
		
		//print
		/* 55555
		 * 44444
		 * 33333
		 * 22222
		 * 11111
		 */
		
		for (int u=5; u>=1; u--) {
			for (int x=5; x>=1; x--) {
				System.out.print(u);
			}
			System.out.println();
}
		//print
		/* 54321
		 * 54321
		 * 54321
		 * 54321
		 * 54321
		 */
		
		for (int a=5; a>=1; a--) {
			for (int z=5; z>=1; z--) {
				System.out.print(z);
			}
			System.out.println();
	}
		//print
		//555555555555555......infinite
		for (int n=5; n>0; n--) {
			for (int b=1; b<=5; b--) {
				System.out.print(n);
			}
			System.out.println();
}
		
		
}
}

