package com.interwiev;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sayac=0;
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter a number");
		int i=scan.nextInt();
		for(int b=2; b<i; b++) {
			if(i%b==0)
			{
				sayac++;
			break;
			}
			
			
		}
		if(sayac==0) {System.out.println(i +" is prime number");
		
		

		}
		else{
			System.out.println("it is not prime number");
		}
	}

}
