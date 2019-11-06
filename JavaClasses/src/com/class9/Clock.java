package com.class9;

public class Clock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=0; i<24; i++) {
			
			for(int j=0; j<60; j++) {
				if (i<10 && j>=10) {
                    System.out.println("0" + i+ ":" + j);
                }else if(i<10 && j<10) {
                    System.out.println("0" + i+ ":0" + j);
                }else if(i>=10 && j<10) {
                    System.out.println(i+ ":0" + j);
                }else {
                    System.out.println(i+ ":" + j);
				
			}
			
		}
		
		
		
		
		}}}


