package com.class5;

public class LogicalNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean b1=!true;
boolean b2=!false;
System.out.println(b1);
System.out.println(b2);
		
		boolean traffic=false;
		if(!traffic) {
			System.out.println("hello");
		}
		else {
			System.out.println("bye");
		}
	
	int a=45;
	int b=78;
	if(!(a==b)) {
		System.out.println("not equal");
	}
	else
	{
		System.out.println("equal");
	}
	
	
	
	String name="zeynep";
	String name2="hatice";
	
	if (!(name.contentEquals("zeynep")) || name2.equals("hatice")) {
		System.out.println("you are not my sister");
	}
	else {
		System.out.println("you are my sister");
	}
	
	
	}

}
