package com.class6;
import java.util.Scanner;
public class repl {
	

	  
	  public static void main (String[] args) {
	    
	    string favoriteCar, carOrigin;
	    Scanner scan;
	    
	    scan=string.Scanner(System.in);
	    
	    System.out.println("Please enter your favorite car make");
	    
	    favoriteCar=scan.nextLine();
	    
	    switch (favoriteCar) {
	      
	      case "BMW":
	        carOrigin="german car";
	        break;
	      case "Toyota":
	        carOrigin="japanese car";
	        break;
	      case "Maserati":
	        carOrigin="italian car";
	        break;
	      default:
	        carOrigin="unknown";
	        
	    }
	    
	    System.out.println("Your favorite car is "+carOrigin);
	    
	  }

	}

}
