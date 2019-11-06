package com.class6;

import java.util.Scanner;

public class Homework6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		int number1=scan.nextInt();
		System.out.println("Enter second number");
		int number2=scan.nextInt();
		System.out.println("Please enter your operator");
		char operator=scan.next().charAt(0);
		int result=0;
		switch(operator) {
		
		case '+':
			result=number1+number2;
			break;
			
		case '-':
			result=number1-number2;
			break;
		case '*':
			result=number1*number2;
			break;
		case '/':
			result=number1/number2;
			break;
			default:
				System.out.println("invalid");
			break;
		}
		System.out.println("result= "+result);
	}

}
