package com.class6;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your grade");
		char grade=scan.next().charAt(0);
		
		String explanation;
		
		switch (grade) {
		
		case 'A':
			explanation="Excellent";
			break;
		case 'B':
			explanation="Good";
			break;
			
		case 'C':
			explanation="Average";
			break;
			
		case 'D':
			explanation="Bad";
			break;
			
		default:
			explanation="Not Acceptable";
			break;
		}
		System.out.println("your grade "+ grade+ " is "+explanation);
	}

}
