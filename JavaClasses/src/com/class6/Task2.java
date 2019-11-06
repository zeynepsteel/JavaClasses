package com.class6;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("is there anyr sale? ");
		Boolean sale=scan.nextBoolean();
		double priceLast;
		double discount;
		
		if (sale) {
			System.out.println("enter the price");
			double price=scan.nextDouble();
			
			if(price<20)
			{
				discount=0.1;
			 priceLast=price-(discount*price);}
			
			else if (price>20 && price<100) {
				discount=0.2;
				priceLast=price-(discount*price);
				
				
			}
			else if (price>100 && price<500) {
				discount=0.3;
				
				priceLast=price-(discount*price);;
				
			
			
			
		}
			else {
				discount=0.5;
				
				priceLast=price-(discount*price);
			}
				System.out.println("after discount "+ discount +"  the price of the item reduce from " +price+ " to "+ priceLast );
			}
			
		
		else {
			System.out.println("i am not shopping");
		}
	}

}
