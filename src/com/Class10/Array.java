package com.Class10;

public class Array {

	public static void main (String[] args) {
		
		int a;
		a = 10;

		int a1 = 10; // 1 way

		int[] b; // declare an array --> preferred way
		int[] c;

		b = new int[4]; // initialize an array

		int[] array = new int[4]; // declaration and initialization in 1 line
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40; // 4th element goes inside index 4
		// access value from an array
		System.out.println(array[2]);

		// lets create an array that will store classes
		String[] classes = new String[4];
		classes[0] = "Java";
		classes[1] = "SDLC";
		classes[2] = "Manual Testing";
		classes[3] = "GIT";
		
		System.out.println("Today we have "+classes[0]+" class");
		
		int[] nums = new int [3];
		nums [0] = 1;
		nums [1] = 2;
		nums [2] = 3;
		// change 1 to 100
		nums [0] = 100;
		System.out.println(nums[0]);
		System.out.println(nums[0]+nums[2]); //103
		
		String [] names = new String [3];// the size of array is fixed
		names [0] = "Shugofa";
		names [1] = "Rahul";
		names [2] = "Best Friends";
//		names [3] = "Gabi";
//		System.out.println(names[0]+" and "+names[1]+" are "+names[2]+names[3]);
//		// because index [3] is out of bounds, during run we will get an exception
		// ArrayIndexOutOfBoundsException
		
		int [] numbers = new int [4];
		numbers [1] = 100;
		numbers [3] = 200;
		// because you don't have numbers in the other indexes
		// the system will give you default numbers
		// default numbers = 0
		System.out.println(numbers[2]);
		
		int [] numm = new int [4];
		numm [0] = 12;
		numm [1] = 13;
		numm [2] = 14;
		numm [3] = 15;
		// to find number of elements inside an array we use (.length)
		System.out.println(numm.length);
		
		String [] arrays = {"Winter", "Fall", "Summer", "Spring"};
		// Print out "I was born during the Summer"
		System.out.println("I was born during the "+arrays [2]);
		// Print out the number of elements
		System.out.println(arrays.length);
		
		int arraysSize = array.length;
		System.out.println(arraysSize);	
		
		
		
		
		
		

	}

}
