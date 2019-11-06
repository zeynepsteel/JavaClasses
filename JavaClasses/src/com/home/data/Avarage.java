package com.home.data;

import java.util.Scanner;

public class Avarage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);


System.out.println("enter first number");
int a=scan.nextInt();
System.out.println("enter second number");
int b=scan.nextInt();
System.out.println("enter third number");
int c=scan.nextInt();
double avarage=(a+b+c)/3;
System.out.println(avarage);

//second task
double height=45;
double width=14;
double perimeter=(height+width)*2;
double area=height*width;
System.out.println("perimeter is "+perimeter);
System.out.println("area is "+area);
	}

}
