package com.class6;

public class switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int time=10;
String timeDay;
if (time>=1 && time<=11) {
	timeDay="morning";
}
	
else if(time>=12 && time<=15) {
	timeDay="noon";
}
else if(time>=16 && time<=20) {
	timeDay="evening";
}
else if(time>=20 && time<=24) {
	timeDay="night";
}
else {
	timeDay="invalid";
}


System.out.println("time of the day is   "+ timeDay);

if (timeDay.contentEquals("morning")) {
	
	System.out.println("good morning");
	
}

	}

}
