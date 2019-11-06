package com.Class11;

public class AnotherExample {

	public static void main(String[] args) {
		
		String[][] names= {
				{"Khan", "Yusuf", "Enrique", "Josh"},
				{"Mohammad”,“Ann”,“Naslyhan”,“Weqas"},
				{"Diago”,“Asif”,“Zubair”,“Shogofa"},    
        };
        
        
        int lengthOfRows=names.length;
        System.out.println(lengthOfRows);
        
        int lengthOfCols=names[2].length;
        System.out.println(lengthOfCols);
        
        for(String getArrays[]: names) {
            for(String getName: getArrays) {
            	System.out.print(getName +" ");
                
            }
            System.out.println();
            
        }
		}
				
		}
