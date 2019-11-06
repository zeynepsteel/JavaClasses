package com.class15;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="gsfsjdg123$#kdfjsd$%%6";
		
		String str2=str.replaceAll("[a-zA-Z]", "");
		System.out.println(str2.length());
		
		System.out.println("***************************");
		String str3="is it saturday?is it raining?do we have a Java class today";
		String[] str4=str3.split("\\?");
		
		
		System.out.println(str4.length);
		
		
	}
	
	
	

}
