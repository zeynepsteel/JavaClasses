package com.class6;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);

		System.out.println("please enter first number");
		double firstNumber=scan.nextDouble();
		System.out.println("please enter second number");
		double secondNumber=scan.nextDouble();
		System.out.println("please enter third number");
		double thirdNumber=scan.nextDouble();



		if (firstNumber>secondNumber) {
			
			if(firstNumber>thirdNumber) {
			System.out.println("the largest number is "+firstNumber);
		}
			else {

				System.out.println("the largest number is "+thirdNumber);	
			}
		}
		
		
		else  {
			if(secondNumber>thirdNumber) {
		
			
			System.out.println("the largest number is "+secondNumber);
		}
			else {

				System.out.println("the largest number is "+thirdNumber);	
			}
		
		}
	

}
}
