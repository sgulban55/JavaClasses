package com.Class8;

public class ForLoopPractice {
	
	public static void main(String[] args) {
		
	
	//print numbers from 1 to 100 in 1 line with space
	for (int i=1; i<=100; i++) {
		System.out.print(i+" ");
	}
	
	System.out.println("****************************");
	
	//print numbers from 100 to 1
	for (int b=100; b>=1; b--) {
		System.out.println(b);
}
	System.out.println("****************************");
	//print even numbers from 20 to 1
	//1 way
	for (int c=20; c>=1; c-=2) {
		System.out.println(c);
	}
	//2nd way
	
	for (int c=20; c>=1; c-=2) {
		if (c%2==0) {
			System.out.println(c);
		}
	
	System.out.println("****************************");
	
	//print odd numbers between 20 and 50
	//1 way
	for (int t=21; t<=50; t+=2) {
		System.out.println(t);
	}
	
	//2 way
	for (int t=21; t<=50; t+=2) {
		if (t%2!=0) {
			System.out.println(t);
		}
	
	System.out.println("****************************");
}
	
	//what is the output
	int sum = 0;
	for (int u=1; u<=5; u++) {
		sum = sum + u;
		System.out.println(sum + "+");
	}
	System.out.println();
	System.out.println(sum);
}
	
	System.out.println("****************************");
	
	//what is the output
	
	int sumAll = 0;
	
	for (int p=0; p<=20; p+=5) {//0, 5, 10, 15, 20
		sumAll=sumAll+p;
	}
	
	System.out.println(sumAll);
	}
}