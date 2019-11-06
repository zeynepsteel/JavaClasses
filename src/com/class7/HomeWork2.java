package com.class7;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int price;
/*do {
	
	System.out.println("Please pay your cooffee");
	int price=scan.nextInt();
	i++;
	if(price==5) {
		System.out.println("enjoy with your coffee");
		i=0;
	}
		
}
while(i>0);*/

	//second way
/*

while(i>=0) {
	
	System.out.println("Please pay your cooffee");
	int price=scan.nextInt();
	
	if(price==5) {
		System.out.println("enjoy with your coffee");
		break;
	}
	
	i++;
	
	
}
*/
do {
	
	System.out.println("Please pay your cooffee");
	price=scan.nextInt();
}
while(price!=5);
System.out.println("enjoy with your coffee");

//second wayyyy
while(price!=5) {
	System.out.println("Please pay your cooffee");
	price=scan.nextInt();
}
System.out.println("enjoy coffee");
}}

