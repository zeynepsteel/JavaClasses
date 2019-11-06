package com.home.array;

public class AvaregeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array= {45,65,75,85};
int sum=0;
int last=0;
for (int i=0; i<array.length; i++) {
	
	sum+=array[i];
}
last= (sum/array.length);

System.out.println(last);
	}

}
