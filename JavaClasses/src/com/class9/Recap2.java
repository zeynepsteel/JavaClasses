package com.class9;

public class Recap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	for(int a=0; a<10;a++) {
			
			for(int b=0; b<10;b++) {
				for(int c=0; c<10;c++) {
					for(int d=0; d<10;d++) {
						System.out.println(a+";"+b+":"+c+":"+d);
					}
				}
					
					
					
				}
		}
		
	
//	hours minutes
	
		for (int i=0; i<=23; i++) {
			for(int j=0; j<=59; j++) {
				
				if (i<12) {
					if (i<10 && j>=10) {
						System.out.println("0" + i+ ":" + j+ " am");
					}else if(i<10 && j<10) {
						System.out.println("0" + i+ ":0" + j+ " am");
					}else if(i>=10 && j<10) {
						System.out.println(i+ ":0" + j+ " am");
					}else {
						System.out.println(i+ ":" + j+ " am");
					}		
				}else {
					if (i<10 && j>=10) {
						System.out.println("0" + (i-12)+ ":" + j+ " pm");
					}else if(i<10 && j<10) {
						System.out.println("0" + (i-12)+ ":0" + j+ " pm");
					}else if(i>=10 && j<10) {
						System.out.println((i-12)+ ":0" + j+ " pm");
					}else {
						System.out.println((i-12)+ ":" + j+ " pm");
					}
				}
				
				
		
			}
		}
	}

}
