package com.home.data;

import java.util.Scanner;

public class TerstenYazdirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("enter a word");
		String word=scan.nextLine();
	int	a=word.length();
		
for(int i=a-1; i>=0; i--) {
	char b=word.charAt(i);
	System.out.println(b);
	
}
		
		
	}

}
