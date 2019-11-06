package com.home.data;

import java.util.Scanner;

public class StringFactoriel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Kullanicidan string alip string in harf sayisinin faktoriyelini ekrana yazdirmak
		
		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String word=scan.nextLine();
		
		int a=word.length();
		
		System.out.println(a);
		
		int fact=1;
		for(int i=1; i<=a; i++) {
			
			
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
