package com.class3;

public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 100;
		if (num1 > num2) {

			System.out.println("num1 is larger than num2");
		}

		else if (num1 == num2) {
			System.out.println("equal");
		}

		else {

			System.out.println("num1 is smaller than num2");
		}

		int day = 6;
		if (day == 1) {
			System.out.println("monday");
		} else if (day == 2) {
			System.out.println("tuesday");
		}

		else if (day == 3) {
			System.out.println("wendsdayy");
		} else if (day == 4) {
			System.out.println("thursday");
		} else if (day == 5) {
			System.out.println("friday");
		} else if (day == 6) {
			System.out.println("saturday");
		} else {
			System.out.println("sunday");
		}

	}

}
