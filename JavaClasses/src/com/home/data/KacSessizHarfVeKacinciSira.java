package com.home.data;

import java.util.Scanner;

public class KacSessizHarfVeKacinciSira {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		String a=scan.nextLine();
	int sayac=0;
	char x='R';
	int b=a.length();
	for(int i=0; i<=b-1; i++) {
		
		if(a.charAt(i)==x) {
			
			
			System.out.println("r harfi "+(i+1)+". siradadir");
			sayac++;
		}
		
	
	}
	
	System.out.println(sayac+"tane R harfi vardir");
		
	}

}
