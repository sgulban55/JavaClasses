package com.class6;
import java.util.Scanner;
public class ClassTask {
	
	public static void main (String[] args) {
		
		/* ask user to enter the month they were born
		 * based on the month define the season
		 * if user is born in Jan, Feb, Dec ---> Winter
		 * if user is born in Mar, Apr, May ---> Spring
		 * if user is born in Jun, Jul, Aug ---> Summer
		 * if user is born in Sep, Oct, Nov ---> Fall
		 * otherwise ---> unknown
		 * at the end of the program
		 * "You were born in ____"
		 */
		
		String month;
		Scanner scanner= new Scanner(System.in);
		System.out.println("Month of born");
		month = scanner.nextLine();
		scanner.close();
		String season;
		
		if (month.equals("January") || month.equals("February") || month.equals("December")) {
			season = "Winter";
		} else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			season = "Spring";
		} else if (month.equals("June") || month.equals("July") || month.equals("August")) {
			season = "Summer";
		} else if (month.equals("September") || month.equals("October") || month.equals("November")) {
			season = "Fall";
		} else
			season = ("Unknown");
		
		System.out.println("You were born in "+season);
		}
	}

