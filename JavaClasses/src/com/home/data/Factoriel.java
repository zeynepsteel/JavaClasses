package com.home.data;

import java.util.Scanner;

public class Factoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fac=1;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a number");
		int a=scan.nextInt();
		for(int i=2; i<=a; i++) {
			
			 fac=i*fac;
			 
		}
		System.out.println(fac);
	}

}
