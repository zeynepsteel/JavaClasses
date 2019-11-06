package com.home.data;

import java.util.Locale;
import java.util.Scanner;

public class ScaneCode {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("not giriniz: ");
		
		
		int not=scan.nextInt();
		
		if (not>=90) {
			System.out.println("AA");
			
		}
		else if(70<=not) {
			System.out.println("BB");
			
		}
	
		else if(50<=not) {
			
			System.out.println("CC");
		}
		
		else {
			System.out.println("KALDINIZ");
			
		}
	
	}

}
