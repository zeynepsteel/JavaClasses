package com.class6;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner scan=new Scanner(System.in);
	System.out.println("Enter your country");
	String country=scan.nextLine();
	
	String language;
	switch (country) {
	
	case "Turkey":
		language="Turkish";
		break;
	case "USA":
		language="English";
		break;
	case "France":
		language="French";
		break;
	case "German":
		language="Germany";
		break;
	case "Spain":
		language="Spanish";
		break;
		default:
			language="Unknown";
			break;
			
	
	}
	
	
	System.out.println(language);
	
	}

}
