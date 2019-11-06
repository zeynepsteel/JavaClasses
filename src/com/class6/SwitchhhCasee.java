package com.class6;

public class SwitchhhCasee {
public static void main(String[] args) {
	int day=5;
	
	String weekDay;
	
	
	switch(day) {
	
	case 1://day===1
		weekDay="saunday";
		
	break;
	case 2://day ==2
		weekDay="monday";
		break;
		
	case 3:
		weekDay="tuesday";
		break;
		
	case 4:
		weekDay="wedenesday";
		break;
		
	case 5:
		weekDay="thursday";
		break;
		
	case 6:
		weekDay="Friday";
		break;
		
	case 7:
		weekDay="saturday";
	break;
	default:
		weekDay="invalid";
		
	}
	System.out.println(weekDay);
	
	
	
}
}
