package com.home.data;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number: ");
		
		int number=scan.nextInt();
		
		int factor=1;
		while(number>=1) {
			
			factor=factor*number;
			
			
			
			
			number--;
			
			
		}
		System.out.println(factor);
		
	}

}
