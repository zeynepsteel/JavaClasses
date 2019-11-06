package com.home.array;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] numbers= {{4,8,7,3,5},{2,2,2,2,2,2},{3,3,3,3,3,}};
int sum1=0;
int sum2=0;
int sum3=0;

		for (int i=0; i<numbers.length; i++) {
			for(int j=0; j<numbers[i].length; j++) {
				
				if(i==0) {
					sum1+=numbers[i][j];
					
				}
				else if(i==1) {
					sum2+=numbers[i][j];
				}
				else {
					sum3+=numbers[i][j];
				}
			}
			
		}
		System.out.println("sum of first row is  "+ sum1);
		System.out.println("sum of second row is  "+ sum2);
		System.out.println("sum of third row is  "+ sum3);
		
	}

}
