package com.class16;

public class Iq8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 
		
		
		int sum=0;
		int a=0;
		int b=1;
		
		for(int i=2; i<12; i++) {
			sum=a+b;
			System.out.println(sum);
			
			a=b;
			b=sum;
			
		}
		
	}

}
