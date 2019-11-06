package com.interwiev;

import java.util.Scanner;

public class Polindrom2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a string");
		String str=scan.nextLine();
		String str2="";
		

		for(int i=str.length()-1; i>=0; i--) {
			
			str2=str2+str.charAt(i);
			
;			
		}
		
		if(str.equals(str2)) {
			
			System.out.println("it is polindrom");
		}
		else {
			
			System.out.println("it is not polindrom");
		}
	}

}
