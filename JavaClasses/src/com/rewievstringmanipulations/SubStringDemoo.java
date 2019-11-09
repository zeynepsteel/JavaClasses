package com.rewievstringmanipulations;

public class SubStringDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longStr = "I am very happy today, because today is not Monday.";
		String anotherStr = longStr.substring(10);
		System.out.println(anotherStr);
				
		anotherStr = longStr.substring(10, 15);
		System.out.println(anotherStr);
				
//		System.out.println(longStr.substring(20, 10));
//		longStr.substring(10, 56);
	}

}
