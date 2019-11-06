package com.class5;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("how many years did you work?");
		int year=scan.nextInt();
		if (year>=5) {
			System.out.println("you are eligible for the bonus");
			System.out.println("enter your salary");
			int salary=scan.nextInt();
			
			if (salary>50000) {
				System.out.println("you can take 5000");
			}
			else {
				System.out.println("you can take 3000");
			}
			
			
		}
		
		else {
			System.out.println("you are not eligible for the bonus");
		}
	}

}
