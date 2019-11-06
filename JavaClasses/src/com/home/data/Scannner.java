package com.home.data;

import java.util.Scanner;

public class Scannner {
	 public static void main(String[] args){

	 Scanner scan=new Scanner(System.in);
	    System.out.println("Input the booean value");
	    
	    boolean val=scan.nextBoolean();
	    
	    
	    if (val==true){
	      
	      System.out.println("The value is " +val);
	      
	    }
	else{
	  
	  System.out.println("The value is " +val);
	}
	    
	 }
}
