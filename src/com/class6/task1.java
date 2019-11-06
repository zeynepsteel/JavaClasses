package com.class6;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

	
	System.out.println("please enter your birth month");
	String month=scan.nextLine();
	String season="";
	
	if (month.equals("january") || month.contentEquals("February") || month.contentEquals("December")) {
		season="Winter";
		
	}
	else if(month.equals("march") || month.contentEquals("april") || month.contentEquals("may")) {
		season="Spring";
	}
	
	else if(month.equals("june") || month.contentEquals("july") || month.contentEquals("august")) {
		season="summer";
	}
	
	else if(month.equals("september") || month.contentEquals("octeber") || month.contentEquals("november")) {
		season="fall";
	}
	
	else {
		season="unknown";
	}
	System.out.println("you are born in "+ season);
}
}
