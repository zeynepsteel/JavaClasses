package com.home.data;

import java.util.Scanner;

public class SesliVeSessizHarfSayma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter word");
		String word=scan.nextLine();
		int sayac=0;
		int sayac2=0;
		int a=word.length();
		
		for(int i=0; i<a; i++) {
			
			
		if(word.charAt(i)=='A' || word.charAt(i)=='E' ||word.charAt(i)=='U' || word.charAt(i)=='O' || word.charAt(i)=='I') {
			sayac++;
		
			
			}
		else if(word.charAt(i)!='A' || word.charAt(i)!='E' ||word.charAt(i)!='U' || word.charAt(i)!='O' || word.charAt(i)!='I') {
			sayac2++;
			
			
		}
		
		
	}
		System.out.println("Sesle harf sayisi"+sayac);
		System.out.println("sessiz harf sayisi" + sayac2);
		System.out.println(word);
}
}
