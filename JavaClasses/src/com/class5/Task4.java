package com.class5;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter day number");
		int day=scan.nextInt();
		
		if (day>=1 || day<=5) {
			
			System.out.println("it is weekday");
		}
		else if(day== 6|| day==7) {
			System.out.println("it is weekend");
		}
		else {
			System.out.println("it is invalid day");
		}
		
		
	}}
