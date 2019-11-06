package com.class6;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	
	System.out.println("wjhere are you from?");
	String country=scan.nextLine();
	String foodName;
	
	switch(country){
		
		
		case "Turkey":
			foodName="kebab";
			break;
			
		case "morocco":
			foodName="tajin";
			
			break;
		case  "pakistan":
			foodName="beryani";
			break;
		case "russia":
			foodName="caviar";
			break;
			default:
				foodName="unknown";
				break;
				
	
		
	}
	
	System.out.println("you are from "+ country+"your favorite food name is "+ foodName);
	}

}
