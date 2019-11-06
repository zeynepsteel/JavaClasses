package com.home.data;

public class SayiDegerlerininToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bir sayinin basamaklarindaki sayilarin sayi degerlerinin kareleri toplami ile o sayinin sayi degeri arasindaki farki hesaplama
	
	int i=45678;
	int one=i%10;
	i=i/10;
	int ten=i%10;
	i=i/100;
	int hundred=i%100;
	i=i/1000;
	
	int d=i%1000;
	i=i/10000;
	int e=i%10000;
	System.out.println(one);
	System.out.println(ten);
	System.out.println(hundred);
	System.out.println(d);
	System.out.println(e);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	

}
