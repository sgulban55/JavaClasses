package com.Class9;

import java.util.Scanner;

public class HomeworkContinued {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter a number");
		int n1 = scan.nextInt();
		System.out.println("Please enter s greater number");
		int n2 = scan.nextInt();
		int sumOdd = 0, sumEven = 0;
		while (n1 <= n2) {
			if (n1 % 2 == 0) {
				sumEven += n1;
			} else {
				sumOdd += n1;
			}
			n1++;
		}
		System.out.println("Total of even numbers: " + sumEven);
		System.out.println("Total of odd number: " + sumOdd);

	}
}
