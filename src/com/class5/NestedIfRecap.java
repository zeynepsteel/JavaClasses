package com.class5;

public class NestedIfRecap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean isDisplayed=true;
String bottonText="sign in";
if (isDisplayed) {
	

	System.out.println(bottonText);
	
	if(bottonText.equals("sign in")) {
		
	System.out.println("passed");
	
}
	else {
		
		System.out.println("not passed");
	}

}
else {
	System.out.println("botton is not displayed");
}
		
	}

}
