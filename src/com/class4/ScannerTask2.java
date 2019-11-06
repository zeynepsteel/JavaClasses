package com.class4;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("your age:");
	Scanner scan=new Scanner(System.in);
	
	int age=scan.nextInt();
	if (age>=18) {
		
		System.out.println("you can take driver licence");
	}
	
	else {
		System.out.println("you can learn an take a permit");
	}
	}

}
