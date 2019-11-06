package com.interwiev;

import java.util.Scanner;

public class Polindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a string");
		String str=scan.nextLine();
		boolean p=true;
		for(int i=0; i<str.length()/2; i++) {
			
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
				
				p=true;
				
			}
			else {
				p=false;
				break;
			}
			
		}

		System.out.println(p);
	
	
	
	
	
	}
	
	
	

}
