package Homework;

import java.util.Scanner;

public class rep {
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("Enter any programming language");
		  
		   String language = sc.nextLine();
		   
		   if (language == "Java") {
		     System.out.println("Java is a programming language");
		   } if (language == "C") {
		     System.out.println("C is a procedural programming language");
		   } if (language == "C++") {
		     System.out.println("C++ is a middle-level programming language");
		     
		     
		   }else {
		     System.out.println("Doesn't match any programming language");
		}
		}
		}
