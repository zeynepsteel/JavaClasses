package com.home.data;

import java.util.Scanner;

public class EnCokHarfSayisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("enter a string");
	String a=scan.nextLine();
	
	int sayac=0;
	char harf=a.charAt(0);
	int encokHarf=0;
	int index=0;
	
	for (int i=0; i<a.length(); i++) {
		for(int j=0; j<a.length(); j++) {
			
			if(a.charAt(i)==a.charAt(j)) {
				
				sayac+=1;
				
			}
			if (encokHarf<sayac) {
				
				encokHarf=sayac;
				index=i;
			}
		
		
		}
		
		

	}
	
	
	System.out.println(a.charAt(index)+ " "+encokHarf);

}}
