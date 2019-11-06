package com.rewiev13;

public class HomeWork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] num= {{1,2,4,5},{7,8,4,5},{3,2,3,2},{1,4,1,4}};
		
		int sum0=0;
		int sum1=0;
		int sum2=0;
		int sum3=0;
		
		for(int i=0; i<num.length; i++) {
			
			for(int j=0; j<num[i].length; j++) {
			if(j==0) {
				
				sum0+=num[i][j];
			}
			else if(j==1) {
				
				sum1+=num[i][j];
			}
             else if(j==2) {
				
				sum2+=num[i][j];
			}
             else {
            	 sum3+=num[i][j];
             }
			
			
			
			}
		}
	
	int[] num1= {sum0,sum1,sum2,sum3};
	
	
	for(int x=0; x<num1.length; x++) {
		System.out.println(num1[x]);
	}
	}

}
