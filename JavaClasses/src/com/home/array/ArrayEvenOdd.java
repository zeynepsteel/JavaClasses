package com.home.array;

import java.util.Scanner;

public class ArrayEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		
		
		int [] a=new int[5];
		int sayac1=0;
		int sayac2=0;
		int sayac3=0;
		int sayac4=0;
		System.out.println("enter the numbers");
		for(int i=0; i<a.length; i++) {
			
			a[i]=scan.nextInt();
			}
		
for(int j=0; j<a.length; j++) {
			
			if(a[j]%2==0) {
				sayac1++;
				System.out.println("even numbers are "+ a[j]+" "+sayac1);
			}
			else {
				sayac2++;
				System.out.println("odd numbers are "+a[j]+" "+sayac2);
			}
			
			if(a[j]>0) {
				sayac3++;
				System.out.println("positive numbers are "+a[j]+" "+ sayac3);
			}
			else {
				sayac4++;
				System.out.println("negative numbers "+a[j]+ " "+sayac4+"negative numbers");
			}
			}
		
		
	}

}
