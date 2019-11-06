package com.class11;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Create an array of cars : american, german, korean, italian. Then retrieve all values from that array
		//Create an array of countries: north america countries, south america countries, europe countries, asian countries, african countries. Then print all values from that array.
		
		String [] a= {"American", "German", "Korean","Italian"};
		
		for(String getCountry:a) {
			
			System.out.println(getCountry);
			
		}
		System.out.println("******************************************************");
		String[] b= {"North America countries","South America countries ", "Europe countries","Asian countries", "African countries"};
		for(String getCountries:b) {
			System.out.println(getCountries);
		}
	}

}
