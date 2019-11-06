package com.class7;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		
		int i=1;
		do {
			System.out.println("please enter your name");
			String name=scan.nextLine();
		System.out.println("goodafternoon "+name);
		i++;
	}while(i<=5);

}}
