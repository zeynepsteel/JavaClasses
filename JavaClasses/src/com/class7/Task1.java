package com.class7;

public class Task1 {
	public static void main(String[] args) {
		
	

	boolean workDay=true;
	int day=1;
	while(workDay) {
		
	
		System.out.println("i need a day off");
		if(day==6) {
			System.out.println("i do need a day off any more");
		
		workDay=false;
		
		}
		day++;
	}
	
	
	//second way
	while(workDay) {
		if(day==6) {
			
			workDay=false;
			System.out.println("i dont need a day of anymore");
		}
		else
		{
			System.out.println("i need a day off");
		}
		
		day++;
	}
}
	
}
