package com.interwiev;

import java.util.Arrays;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array= {12,32,45,85,78,96};

Arrays.sort(array);
int max=0;

int secondLargest=0;
for(int i=0; i<array.length; i++) {
	
	if (i==array.length-1) {
		
	max=array[i];
	}
	
	else if(i==array.length-2) {
		
		secondLargest=array[i];
	}
}


System.out.println("max number is "+ max);
System.out.println("second maximum number is "+ secondLargest);


	System.out.println("*********************************");
	
	
		
	}

}
