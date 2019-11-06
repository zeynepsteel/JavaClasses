package com.rewiev13;

import java.util.Scanner;

public class ScannerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);


System.out.println("Body, how many row");

int row=scan.nextInt();
System.out.println("how many column");
int col=scan.nextInt();

System.out.println("your array will have "+ row+"and "+col);

String[][] name=new String[row][col];


for(int i=0; i<row; i++) {
	
	for(int j=0; j<col; j++) {
		
		
		System.out.println("enter name");
		name[i][j]=scan.next();
		
		
	}
}

for(int i=0; i<row; i++) {
	
	for(int j=0; j<col; j++) {
		
		
		System.out.println(name[i][j]);
		
		
	}
}

	}

}
