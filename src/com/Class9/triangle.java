package com.Class9;

public class triangle {
	
	public static void main (String[] args) {
		
		//number of rows should never exceed the number of columns
		
		//print
		//*
		//**
		//***
		//****
		//*****
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
		//print
		//1
		//22
		//333
		//4444
		//55555
		//666666
		//7777777
		//88888888
		//999999999
		for (int i = 1; i >= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
	}
}
