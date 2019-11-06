
public class NotPractice {

	public static void main (String[] args) {
		
		boolean b1=!true;// ! means not
		boolean b2=!false;
		
		System.out.println(b1);
		System.out.println(b2);
		
		boolean traffic=true;
		
		if (!traffic) {
			System.out.println("On time");
		}else {
			System.out.println("Late");
		}
		
		boolean isRain=false;
		
		if (!isRain) {
			System.out.println("Take an umbrella");
		}else {
			System.out.println("Do not take an umbrella");
		}
		
		//lets compare 2 numbers not using an operator
		
		int num1=10;
		int num2=11;
		
		if (num1==num2) {
		System.out.println("Numbers are equal");
		}else {
		System.out.println("Numbers are not equal");
		
		}
		
		if (!(num1==num2)) {
		System.out.println("Numbers are NOT equal");
		}else {
			System.out.println("Numbers are equal");
		}
		
		//if name is not Mary or Anna then you are not my sister
		
		String name="Mary";
		String name2="Anna";
		
		if (!(name.equals("Mary") || name2.equals("Anna"))) {
			System.out.println("You are not my sister");
		}else {
			System.out.println("You are my sister");
			
		}
		
		String name3="Mary";
		String name4="Anna";
		
		if (!(name3==name4)) {
	
		System.out.println("You are not my sister");
	   }else {
		System.out.println("You are my sister");
		
	   }
	}
	
}
