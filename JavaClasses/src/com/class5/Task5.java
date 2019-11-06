package com.class5;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter your height");
		int height=scan.nextInt();
		
		if(height<5) {
			System.out.println("SHORT");
		}
		else if(height>=5 && height<6) {
			System.out.println("medium");
		
		}
		else if(height>=6 && height>6) {
			System.out.println("tall");
		}
		}
	
	

}
