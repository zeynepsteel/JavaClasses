package com.class16;

import java.util.Scanner;

public class StringManipulationsTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("enter your browser");
String b=scan.nextLine();
String c=b.toUpperCase();
switch(c){
	case "FIREFOX":
		
		System.out.println("your browser is "+ c);
	break;
		
	case "CHROME":
		
		System.out.println("your browser is "+ c);
		break;
case "ie":
		
		System.out.println("your browser is "+ c);
	break;
		
	case "SAFARI":
		
		System.out.println("your browser is "+ c);
		break;

default: 
	System.out.println("invalid");
}


	}

}
