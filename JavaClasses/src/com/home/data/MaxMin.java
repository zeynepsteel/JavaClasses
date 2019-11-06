package com.home.data;

import java.util.Scanner;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("enter 5 numbers");
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=scan.nextInt();
int e=scan.nextInt();
if (a>b && a>c && a>d && a>e) {
	
		
System.out.println("the largest number is" +a);
		
	
}
else if (b>a &&b>c && b>d && b>e) {
		
	System.out.println("the largest number is" +b);

}

else if(c>d && c>e && c>a && c>b) {
	
		System.out.println("the largest number is" +c);
	
	
}
else if(d>a && d>b && d>c && d>e) {
	
	System.out.println("the largest number is " + d);
}
else {
	System.out.println("the largest number is " + e);
}



if (a<b && a<c && a<d && a<e) {
	
	
System.out.println("the smalllest number is" +a);
		
	
}
else if (b<a &&b>c && b<d && b<e) {
		
	System.out.println("the  smalllest number is" +b);

}

else if(c<d && c<e && c<a && c<b) {
	
		System.out.println("the  smalllest number is" +c);
	
	
}
else if(d<a && d<b && d<c && d<e) {
	
	System.out.println("the  smalllest number is " + d);
}
else {
	System.out.println("the  smalllest number is " + e);
}
	}

}
