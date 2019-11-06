package com.interwiev;

public class Fibinacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a= {9,8,5,67,45,56,38};
		int max = a[0];
		int secondMax = a[0];
		int min=a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}else if(min>a[i]){
				min =a[i];
			}else if (secondMax < max && a[i] > secondMax) {
				secondMax = a[i];	
			}
		}
		
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(secondMax);
            }

		
		
	}


