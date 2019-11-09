package com.home.data;

public class TekrarEdenKelime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Where are you from? Are you from Turkey?";
		String[] temp=str.toLowerCase().replaceAll("[^a-z ]", "").split(" ");
		
		for (String t:temp) {
			System.out.print(t+" ");
		}
		
		String str1="";
		

		for (int i = 0; i < temp.length; i++) {
			boolean b=false;
			for (int j = 0; j < i; j++) {
				if(temp[i].equals(temp[j])) {
					
					b=true;
					break;
				}
			}
			if(!b) {
				str1=str1.concat(temp[i]+ " ");
			}
		}
		
		System.out.println(str1);
		
		String[] temp1=str1.split(" ");


		
		for (int i = 0; i < temp1.length; i++) {
			int count=0;
			for (int j = 0; j < temp.length; j++) {
				if(temp1[i].equals(temp[j])) {
					count+=1;
				}
			}
			
			System.out.println(temp1[i] +" is repeated " + count + " times.");
		}
		
	}

}
