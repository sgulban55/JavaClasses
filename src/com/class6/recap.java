package com.class6;

import java.util.Scanner;

public class Homework {
	
	public static void main (String[] args) {
		
		Scanner scan;
		int quiz, midterm, finalScore, average;
		
		scan = new Scanner(System.in);
		System.out.println("Please enter quiz score");
		quiz = scan.nextInt();
		
		System.out.println("Please enter midterm score");
		midterm = scan.nextInt();
		
		System.out.println("Please enter final score");
		finalScore = scan.nextInt();
		
		average = (quiz+midterm+finalScore)/3;
		
		if (average>=90) {
			System.out.println("A");
		}else if (average >=70 && average <90) {
			System.out.println("B");
		}else if (average >=50 && average <70) {
			System.out.println("C");
		}else if (average<50) {
			System.out.println("D");
		}else {
			System.out.println("Unknown");
		}
	}

}

public class recap {
	
	public static void main (String[] args) {
		
		/* declare the time
		 * based on the time identify whether it is morning, afternoon, evening or night
		 * if 1-11 ---> morning
		 * if 12-15 ---> noon
		 * if 16-20 ---> evening
		 * if >20 ---> night
		 */
	
	
	int time = 10;
	String timeOfDay;
	
	if (time>=1 && time<=11) {
		timeOfDay = "Morning";
	}else if (time>=12 && time<=15) {
		timeOfDay = "Noon";
	}else if (time>=16 && time<20) {
		timeOfDay = "Evening";
	}else if (time>20) {
		timeOfDay = "Night";
	}else
		timeOfDay = "Invalid";

	System.out.println("Time of the day is "+timeOfDay);
	
	if (timeOfDay.equals("Morning")) {
		System.out.println("Good Morning");
	}
	

}
}
