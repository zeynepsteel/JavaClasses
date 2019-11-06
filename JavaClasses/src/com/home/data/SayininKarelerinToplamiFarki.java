package com.home.data;

import java.util.Scanner;

public class SayininKarelerinToplamiFarki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bir sayinin basamaklarindaki sayilarin sayi degerlerinin kareleri toplami ile o sayinin sayi degeri arasindaki farki hesaplama
		 Scanner reader = new Scanner(System.in);
	        
	        System.out.print("Bir Sayı Girin: ");
	 
	        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.
	        int num = reader.nextInt();
	 
	        int adet = 0;
	 
	        while(num != 0)
	        {
	            // num = num/10
	            num /= 10;
	            ++adet;
	        }
	 
	        System.out.println("Sayının Basamak Sayısı: " + adet);
	    } 
	}