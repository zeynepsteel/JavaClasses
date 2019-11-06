package com.class5;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner scan=new Scanner(System.in);
	System.out.println("please enter a number");
	int num=scan.nextInt();
	if ((num>1)&&(num<10)) {
		
		System.out.println("the number is small");
	}
	else if(num>=10 && num<100) {
		System.out.println("the number is medium");
	}
	
	else if(num>=100 && num<1000) {
		System.out.println("the number is large");
	}

	
	else {
		System.out.println("the number isout of range");
}
	
	}
	
}
