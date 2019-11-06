import java.util.Scanner;

public class ScannerandLogicalPrac {
	
	public static void main (String[] args) {
		
		/* Ask user to enter age
		 * if age is from 1 to 3 ---> You are a baby
		 * if age is from 3 to 5 ---> You are a toddler
		 * if age is from 5 to 12 ---> You are a kid
		 * if age is from 12 to 19 ---> You are a teenager
		 * if age is >20 ---> You are an adult
		 */
		
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter age");
		
		int a=keyboard.nextInt();
		
		if (a>=1 && a<=3) {
			System.out.println("You are a baby");
		}else if (a<=3 && a<=5) {
			System.out.println("You are a toddler");
		}else if (a>5 && a<=12) {
			System.out.println("You are a kid");
		}else if (a>12 && a<=19) {
			System.out.println("You are a teenager");
		}else if (a>20) {
			System.out.println("You are an adult");
		}else {
			System.out.println("Not a valid age");
		
		}
	
		String human;
		
		human=keyboard.nextLine();
		
		int b=keyboard.nextInt();
		
		if (b>=1 && b<=3) {
			human="baby";
		}else if (b<=3 && b<=5) {
			human="todder";
		}else if (b>5 && b<=12) {
			human="kid";
		}else if (b>12 && b<=19) {
			human="teenager";
		}else if (b>20) {
			human="adult";
		}else {
			human="unknown";
			
		System.out.println("You are "+human);
		}
	}
}
		
