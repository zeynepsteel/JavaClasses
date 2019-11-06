package com.rewiev;

public class NestedForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*for(int i=1;i<=4; i++) {
			for(int i1=1;i1<=6; i1++) {
			System.out.print("*");}
			System.out.println();
		}
		*/
		
		for(int i=1;i<=5; i++) {
			for(int i1=5;i1>i; i1--) {
			System.out.print(" ");}
			for(int j=1; j<=i ; j++) {
				System.out.print(j);}
			
			System.out.println();
		}
		
	}

}
