package com.class4;

import java.util.Scanner;

public class ScannerTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Your City Name: ");
		Scanner scan1=new Scanner(System.in);
		String city=scan1.nextLine();
		System.out.println("Your city's temperature: ");
		
		Scanner scan=new Scanner(System.in);
		
		double temp=scan.nextDouble();
		
		
		double temp2=(temp -32)*0.5556;
		System.out.println("The Temperature is the city "+ temp+" is "+temp2);
		
	}

}
