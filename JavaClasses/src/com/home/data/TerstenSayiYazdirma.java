package com.home.data;

import java.util.Scanner;

public class TerstenSayiYazdirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter a number");
		int a=scan.nextInt();
		int firstNum=a;
		
		int reverse=0;
		int lastDigit;
		while(a!=0) {
			
			lastDigit=a%10;
			reverse=reverse*10+lastDigit;
			a/=10;
			
		}

System.out.println("*******************");

System.out.println(reverse);
if (reverse==firstNum) {
	System.out.println(firstNum+" is a polindrom");
}else {
	
	System.out.println(firstNum+ " is not a polindrom");
}
	}
	

}
