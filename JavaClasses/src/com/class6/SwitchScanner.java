package com.class6;

import java.util.Scanner;

public class SwitchScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("please enter your gender as F or M:");
	char gender=scan.next().charAt(0);
	
	String userGender;
	
	
	switch (gender) {
	
	case 'F':
		userGender="female";
		break;
	case 'M':
		userGender="male";
		break;
		
	
	default:
			userGender="male";
			break;
			
		
		
	}
	System.out.println("your gender is  "+ userGender);
	
	}

}
