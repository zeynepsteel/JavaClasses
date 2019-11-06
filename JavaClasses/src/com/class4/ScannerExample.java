package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any number");
	Scanner scan=new Scanner(System.in);
	
	int number=scan.nextInt();
	System.out.println("entered number: "+ number);
	
	
	Scanner input= new Scanner(System.in);
	System.out.println("please enter your name");
	
	String name=input.nextLine();
	System.out.println("goodmorning "+ name);
	
	
	
	}

}
