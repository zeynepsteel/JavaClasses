package com.class5;

import java.util.Scanner;

public class LogicalAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your age: ");
		int age=scan.nextInt();
		if (age>=1 && age<3) {
			System.out.println("Baby");
		}
		else if (age<=3 && age<5)
		{
		System.out.println("TODDLER");
	}
		
		else if (age>=5 && age<12)
		{
		System.out.println("KID");
	}
		else if (age>=12 && age<19)
		{
		System.out.println("TEENAGER");
	}
		else {
			System.out.println("ADULT");
		}
	}
}