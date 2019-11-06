
public class OrPractice {
	
	public static void main (String[] args) {
		
		/*7 days a week
		 * if days is 2 or 4 ---> SDLC Class
		 * if day 6 or 7 ---> Java Class
		 * if day 1 or 5 ---> No Class
		 * if day =3 ---> Review Class
		 */
		
		int day = 6;
		
		if (day==2 || day==4) {
			System.out.println("SDLC Class");
		}else if (day==6 || day==7) {
			System.out.println("Java Class");
		}else if (day==1 || day==5) {
			System.out.println("No Class");
		}else if (day==3) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
			
		}
		
		/*7 days a week
		 * if days is Tuesday or Thursday ---> SDLC Class
		 * if days is Saturday or Sunday ---> Java Class
		 * if days is Monday or Friday ---> No Class
		 * if days is Wednesday ---> Review Class
		 */
		
		String weekDay="friday";
		
		if (weekDay.equals("Tuesday") || weekDay.equals("Thursday")) {
			System.out.println("SDLC Class");
		}else if (weekDay.equals("Saturday") || weekDay.equals("Sunday")) {
			System.out.println("Java Class");
		}else if (weekDay.equals("Monday") || weekDay.equals("Friday")) {
			System.out.println("No Class");
		}else if (weekDay.equals("Wednesday")) {
			System.out.println("Review Class");
		}else {
			System.out.println("Not a valid day");
			
		}
		
		/*Write a program that will print whether is is a weekend or weekday
		 * If any day from 1-5 ---> It is a Weekday
		 * If any day from 6 or 7 ---> It is a Weekend
		 * Any other day ---> Invalid day
		 */
		
		int a=4;
		
		if (a>=1 && a<=5) {
			System.out.println("It is a Weekday");
		}else if (a>6 || a<=7) {
			System.out.println("It is a Weekend");
			
		}else {
			System.out.println("Not a valid day");
		
		}

		/* Prompt the user to enter person heights in feet
		 * Person should be classified as one of the following
		 * Short = under 5 ft
		 * Medium = 5 to 6 ft
		 * Tall = 6 ft and over
		 */
		
		
		}
		
		
	}	



