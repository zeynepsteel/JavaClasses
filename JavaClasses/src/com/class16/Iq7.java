package com.class16;

import java.util.Scanner;

public class Iq7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("enter a number");
	int num=scan.nextInt();
int sayac=0;
for(int i=2; i<num; i++) {
	if(num%i==0){
		sayac++;
		break;
		
	
	}
}

if(sayac==0) {
		System.out.println("it is  prime number");
}
else {
	
	System.out.println("it is not prime number");
	}
	}
}
