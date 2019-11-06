package com.class9;

public class Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 1;
        for (int j = 5; j >= 1; j--) {
            for (int l = 0; l < ((10 - k) / 2); l++) {
                System.out.print(" ");
            }
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            k += 2;
            System.out.println("");
        }
	}

}
