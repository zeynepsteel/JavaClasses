package com.class5;

import java.util.Scanner;

public class MoreExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter daily sales");
		
		double sale=scan.nextDouble();
		double comission;
		
		if (sale<100) {
			
			comission=sale*0.1;
			
			System.out.println("commision is %10 "+ comission);
		}
		
		else if(sale>=100 && sale<200) {
			comission=sale*0.2;
			
			System.out.println("commision is 20% "+comission);
		}
		else if (sale>=200 && sale<500) {
			
			comission=sale*0.3;
			System.out.println("commision is 30% "+comission);
		}
	
		
		else if(sale>=500) {
			comission=sale*0.5;
			System.out.println("commision is 50% "+comission);
		}
	
		else {
			comission=0;
			System.out.println("commision is 0% "+comission);
		}
	}

}
