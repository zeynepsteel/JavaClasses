package com.interwiev;

import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

		System.out.println("enter a word");
		String str=scan.nextLine();
		
		int a=str.length()-1;
		boolean result=true;
		
		
		for(int i=0; i<str.length()/2; i++) {
			
			if(str.charAt(i)==str.charAt(a-i)) {
				
				result=true;
			}else {
				
				result=false;
				break;
			}
			
				
				
			
			
		}
		
		System.out.println(result);
	}

}
