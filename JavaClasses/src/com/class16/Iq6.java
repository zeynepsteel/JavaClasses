package com.class16;

import java.util.Scanner;

public class Iq6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a string");
		String str=scan.nextLine();
		
		String str1="";
		
		for (int i=str.length()-1; i>=0; i--) {
			
			str1=str1+str.charAt(i);
			
		}
		
		
		if(str.equals(str1)) {
			
			System.out.println(str+" is polindrom string.");
		}
		else {
			
			System.out.println(str+ " is not a polindrom string.");
		}
	}

}
