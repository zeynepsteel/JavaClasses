package com.class11;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [] country= {"Turkey","USA","BELGIUM","ENGLAND"};
String[] capitals= {"Ankara","Washington","Brussels","London"};		
		
for (int i=0; i<4; i++) {
		
System.out.println("Country of "+country[i]+" is "+capitals[i]);
	
	
}


for (String count:country) {
	
	
	if(count.equals("Turkey")) {
		
		System.out.println("the capital of turkey is "+capitals[0]);
	}
if(count.equals("USA")) {
		
		System.out.println("the capital of USA is "+capitals[1]);
	}
if(count.equals("BELGIUM")) {
	
	System.out.println("the capital of BELGIUM is "+capitals[2]);
}
if(count.equals("ENGLAND")) {
	
	System.out.println("the capital of ENGLAND is "+capitals[3]);
}
}

	}

}
