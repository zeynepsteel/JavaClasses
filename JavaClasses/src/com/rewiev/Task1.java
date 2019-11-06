package com.rewiev;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("how many do you want to add?");
int sum=0;
int size=scan.nextInt();
int[] array=new int[size];
for (int i=0; i<size; i++) {
	
	array[i]=scan.nextInt();
	sum=sum+array[i];

System.out.println("array's  "+i+". elment is "+array[i]);}
System.out.println("sum is "+sum);


	ortalama(sum);
	System.out.println(sum);
	
}
	
	public static void ortalama(int argument) {
		int [] array= {40,30,50};
		int sum=0;
		for(int i=0; i<3; i++) {
			
			sum+=array[i];
			
			
		}
		int ort=sum/array.length;
		System.out.println(ort);
	}

}
