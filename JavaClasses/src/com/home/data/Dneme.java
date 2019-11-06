package com.home.data;

import java.util.Scanner;

public class Dneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner scan=new Scanner(System.in);

		
		System.out.println("Please enter your favorite car make");
		String car=scan.nextLine();
		String carOrigin;
		
		switch (car){
		  case "BMW":
		    carOrigin="german car";
		  break;
		  case "Toyota":
		    carOrigin="japanese car";
		  break;
		  case "Maserati":
		    carOrigin="italian car";
		  break;
		  default:
		    carOrigin="german car";
		  break;
		  
		}
		System.out.println("Your favorite car is "+carOrigin);
		
		
		
		
		
	
	
	}

}
