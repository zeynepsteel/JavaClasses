package com.class4;

import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner keyboard=new Scanner(System.in);
		
		System.out.println("please enter first number: ");
		
		int number=keyboard.nextInt();
		System.out.println("please enter second number:");
		int num2=keyboard.nextInt();
		if (number>num2) {
			
			System.out.println(number+ " is larger than"+num2);
			
		}
		else if (number==num2) {
			
			System.out.println(number+ "is egual"+num2);
			
		}
		else {
			System.out.println(number+ " is smaller than"+num2);
			
			
		}
		
	}

}
