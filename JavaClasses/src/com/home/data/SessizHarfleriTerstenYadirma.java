package com.home.data;

import java.util.Scanner;

public class SessizHarfleriTerstenYadirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a word");
		String word=scan.nextLine();
		
		
		int a1=word.length();
		
		char a='a';
		char e='e';
		char u='u';
		char i='i';
		char o='o';
		
		
		for(int x=a1-1; x>=0; x--) {
			
			if(word.charAt(x)==a || word.charAt(x)==e ||word.charAt(x)==u || word.charAt(x)==i ||word.charAt(x)==o) {
				
				continue;
				}
			System.out.print(word.charAt(x));
			
		}
	}

}
