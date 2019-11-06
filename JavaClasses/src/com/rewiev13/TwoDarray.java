package com.rewiev13;

import java.util.Arrays;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [][] a= {{12,52,45,75},{45,1,2,3,46,89,90}};

System.out.println();
for(int i=0; i<a.length; i++){
	for(int j=a[i].length-1; j>=0; j--)
	{
		if(i==1) {
		Arrays.sort(a[1]);
		System.out.print(a[1][j]+" ");}
		
	}}
		System.out.println();
			System.out.print("max is in second row "+a[1][a[1].length-1]);
	
	}

}
