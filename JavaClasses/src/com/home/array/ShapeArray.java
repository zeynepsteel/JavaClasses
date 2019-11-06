package com.home.array;

import java.util.Scanner;

public class ShapeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int number[][] = new int[10][10];

		for (int row = 0; row < number.length; row++) {
		for (int col = 0; col < number.length; col++) {
		System.out.print(number[row][col] + " ");
		}
		System.out.println();
		}
		
		
		
	}

}
