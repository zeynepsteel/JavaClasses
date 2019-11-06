package com.class13;

public class StringManipilations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="john";//first way
String name1=new String("zeynep");//second way

System.out.println(name);
int size=name.length();//gives size of it
System.out.println(size);
	
	//*******************************************
	
	//.toLowerCase();
	String str1="Hello World";
	String newstr=str1.toLowerCase();
	System.out.println(newstr);
	
	
	//.equalsIgnoreCase();
	String str2="Hello WORLD";
	System.out.println(str1.equalsIgnoreCase(str2));
	
	
	//.toUpperCase();
	String str3="Mohammed";
	System.out.println(str3.toUpperCase());
	
	}

}
