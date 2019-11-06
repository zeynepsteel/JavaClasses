package com.class5;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);

System.out.println("please enter your quiz score: ");
int quiz=scan.nextInt();

System.out.println("please enter your midterm score: ");
int midTerm=scan.nextInt();
System.out.println("please enter your final score: ");
int finalExam=scan.nextInt();

double avarage=(quiz+midTerm+finalExam)/3;

	if(avarage>=90) {
		System.out.println("Grade A "+avarage );
	}
	else if (avarage>=70 && avarage<90) {
		System.out.println("Grade B "+avarage);
	}
	
	else if (avarage>=50 && avarage<70) {
		System.out.println("Grade C "+avarage);
	}
	
	else if (avarage<50) {
		System.out.println("Grade F "+avarage);
		
	}
	}

}
