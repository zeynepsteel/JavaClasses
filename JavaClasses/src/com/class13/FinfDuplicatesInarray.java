package com.class13;

public class FinfDuplicatesInarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array= {2,5,4,7,2};

for (int i =0; i<array.length; i++) {
	
	for(int j=i+1; j<array.length; j++) {
		
		
		if(array[i]==array[j]) {
			System.out.println(array[j]);
		}
	}
}

	}

}
