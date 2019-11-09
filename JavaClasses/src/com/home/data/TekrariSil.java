package com.home.data;

import java.util.Arrays;

public class TekrariSil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="zeynepeepp";
		char[] array=str.toLowerCase().trim().toCharArray();
		String str1="";
		
		
		System.out.println(array);
		
		char a=array[0];
		
		for (int i = 0; i < array.length; i++) {

				if (a!=array[i]) {
					a=array[i];
					str1=str1+a;
				}

		}
		System.out.println(str1);
		int i=0;
		
		do {
			str1=str1+array[i];
			i++;
		}while(array[i]!=array[i+1] && i<array.length);
		
		System.out.println(str1);

	}


	}


