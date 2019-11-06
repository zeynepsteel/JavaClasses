package com.class5;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		
		
		boolean card=scan.nextBoolean();
		
		
		
		if(card) {
		System.out.println("what is your balance");
			
		int balance=scan.nextInt();
		
		if (balance>1000) {
			System.out.println("please pay off your your balance");
		}
		else {
			System.out.println("you can spend more money");
		}
		}
		
		else {
			
			System.out.println("would you like to apply to it?");
			
			String ans=scan.next();
			if(ans.equals("yes")) {
				System.out.println("go to desk");
			}
			else {
				System.out.println("bye");
			}
			
		}
	}

}
