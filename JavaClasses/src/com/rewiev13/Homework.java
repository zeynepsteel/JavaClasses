package com.rewiev13;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] num= {{1,2,4,5,6},{7,8,4,5,9,6},{3,2,3,2,3,2},{1,4,1,4,5,2,5}};
		
		int sumRow0=0;
		int sumRow1=0;
		int sumRow2=0;
		int sumRow3=0;
		
		for(int i=0; i<num.length; i++) {
			
			for(int j=0; j<num[i].length; j++) {
			if(i==0) {
				
				sumRow0+=num[i][j];
			}
			else if(i==1) {
				
				sumRow1+=num[i][j];
			}
             else if(i==2) {
				
				sumRow2+=num[i][j];
			}
             else {
            	 sumRow3+=num[i][j];
             }
			
			
			
			}
		}
	
	int[] array= {sumRow0, sumRow1,sumRow2,sumRow3};
	
	for(int k=0; k<array.length; k++) {
		
		System.out.println(array[k]);
	}
	
	
	}
	

}
