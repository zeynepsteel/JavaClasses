package com.class5;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number of day ");
		int day=scan.nextInt();
		if (day==2 || day==4) {
			System.out.println("SDLC CLASS");
		}
		else if(day==6 || day==7) {
			System.out.println("JAVA CLASS");
		
	}

		else if(day==1 || day==5) {
			System.out.println("NO CLASS");
		
}
		else if(day==3) {
			System.out.println("review CLASS");
}
		else
		{
			System.out.println("not valid day");
		}
	}}