package com.class17;

public class IQ6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=5;
boolean prime=true;
if(num<=1) {
	prime=false;
}else {
for (int i = 2; i < num; i++) {
	if(num%i==0) {
		prime=false;
		break;
	}
	
	}
if(prime) {
	System.out.println(num+ " is prime num");
	
}else {
	System.out.println(num+ " is not prime number");
}
	}}

}
