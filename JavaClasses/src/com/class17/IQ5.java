package com.class17;

public class IQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String given="welcome to the Java class";
String[] str=given.split("\\s");
String reversed="";
for(int i=str.length-1; i>=0; i--) {
	
	reversed=reversed+str[i]+" ";
}
System.out.println(reversed);
System.out.println("****************");

char[] arr=given.toCharArray();

for(int j=arr.length-1; j>=0; j--) {
	
	System.out.print(arr[j]);
}
	}

}
