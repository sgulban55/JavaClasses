package Homework;

import java.util.Scanner;
class Main {
  
	public static void main (String[] args) {
	String result = null;
    
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Please enter two strings");
    
    String name1=scan.nextLine();
    String name2=scan.nextLine();
    
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter two numbers");
    int num1=input.nextInt();
    int num2=input.nextInt();
    
    if((num1==num2) && (name1.equals(name2))) {
        result = "AND";
        
      }else if((num1==num2) || (name1.equals(name2))) {
        result = "OR";
        
    } else if(!(num1!=num2) && !(name1.equals(name2))) {
        result = "NONE";
    } else {
      System.out.println("Unknown");
    }
    System.out.println(result);
    }
}
    
