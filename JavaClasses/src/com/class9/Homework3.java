package com.class9;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int start, end;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter start point");
		int a=scan.nextInt();
		
		System.out.println("enter end point");
		int b=scan.nextInt();
		int evenTotal=0;
		int oddTotal=0;
		if(a<b) {
			
			start=a;
			end=b;
		}
		else {
			start=b;
			end=a;
		}
		for(int  i=start; i<=end; i++) {
		if (i%2==0) {
			evenTotal=evenTotal+i;
		}
		else {
			oddTotal=oddTotal+i;
		}
			
		}
		System.out.println("even total is "+evenTotal);
		System.out.println("even total is "+oddTotal);
	}

}
