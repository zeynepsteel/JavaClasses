package com.home.data;

import java.util.Scanner;

public class Rectangular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("please enter length of the rectangle= ");
		int length=scan.nextInt();
		
		System.out.println("please enter width of the rectangle= ");
		int width=scan.nextInt();
		
		System.out.println("please enter length of the Square= ");
		int length2=scan.nextInt();
		
	int areaR=length*width;
	int areaSquare=length2*length2;
	int i=areaR/areaSquare;
	System.out.println("you can put "+i+ " square in the rectangale");
		
	}

}
