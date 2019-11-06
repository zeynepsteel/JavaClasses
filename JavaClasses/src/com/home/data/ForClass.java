package com.home.data;

import java.util.Scanner;

public class ForClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*Scanner scan=new Scanner(System.in);
System.out.println("enter a number");
	int result=scan.nextInt();
	int i=0;
	while(i<10)
	{
	while(result<100) {
		System.out.println( result+"*"+(i+1)+"="+(result*(i+1)));
		result++;
	}
		
	i++;
	}
	
	*/
	
		
int a=1;
int b=1;
		
		for (a=1;a<=10;a++) {
			for(b=1;b<=10;b++) {
				System.out.println(a + "x" + b + "=" + (a*b));
			}
		}
	while(a<=10) {
		while(b<=10) {
			System.out.println(a + "x" + b + "=" + (a*b));
			b++;
		}
		
		
		a++;
	}
	
	
	}


	

}
