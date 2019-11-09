package com.class16;

public class InterwievQuestion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=30;
int b=40;
a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);
	
String str1="hello";
String str2="welcome";


String x="abc";
String y="defg";
 x=x.concat(y);
 x.length();
 y.length();
//System.out.println(x);
//System.out.println(y);
y=x.substring(0,x.length()-y.length());
System.out.println(y);
x=x.substring(y.length());
System.out.println(x);


}
}