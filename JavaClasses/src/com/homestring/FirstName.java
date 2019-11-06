package com.homestring;

import java.util.Scanner;

public class FirstName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("enter your first name");
String first=scan.nextLine();
System.out.println("enter your middle name");
String middle=scan.nextLine();
System.out.println("enter your lastname name");
String last=scan.nextLine();

System.out.println(first.charAt(0)+"."+middle.charAt(0)+"."+last);

	}

}
