package com.home.data;
import java.lang.Math;
import java.util.Scanner;

public class KacHarf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a word");
		String a=scan.nextLine();

		int sayac=0;
		int sayac1=0;
		int sayac2=0;
		int sayac3=0;
		int sayac4=0;
		int sayac5=0;
		int sayac6=0;
		int sayac7=0;
		int sayac8=0;
		int sayac9=0;
	
	
	int b=a.length();
	for(int i=0; i<=b-1; i++) {
		
		if(a.charAt(i)=='a' || a.charAt(i)=='A') {
			System.out.println("a harfi "+(i+1)+". siradadir");
			sayac++;
			System.out.println(sayac+"tane a harfi vardir");
		}
		
		else if(a.charAt(i)=='b' || a.charAt(i)=='B') {
			System.out.println("B harfi "+(i+1)+". siradadir");
			sayac1++;
		}
		else if(a.charAt(i)=='c' || a.charAt(i)=='C') {
			System.out.println("C harfi "+(i+1)+". siradadir");
			sayac2++;
		}
		else if(a.charAt(i)=='d' || a.charAt(i)=='D') {
			System.out.println("d harfi "+(i+1)+". siradadir");
			sayac3++;
		}else if(a.charAt(i)=='e' || a.charAt(i)=='E') {
			System.out.println("E harfi "+(i+1)+". siradadir");
			sayac4++;
		}else if(a.charAt(i)=='f' || a.charAt(i)=='F') {
			System.out.println("F harfi "+(i+1)+". siradadir");
			sayac5++;
		}else if(a.charAt(i)=='g' || a.charAt(i)=='G') {
			System.out.println("G harfi "+(i+1)+". siradadir");
			sayac6++;
		}else if(a.charAt(i)=='h' && a.charAt(i)=='H') {
			System.out.println("H harfi "+(i+1)+". siradadir");
			sayac7++;
		}
		else if(a.charAt(i)=='i' && a.charAt(i)=='I') {
			System.out.println("I harfi "+(i+1)+". siradadir");
			sayac8++;
		}
	
	}
	
	System.out.println(sayac+"tane a harfi vardir");
	System.out.println(sayac1+"tane B harfi vardir");
	System.out.println(sayac2+"tane C harfi vardir");
	System.out.println(sayac3+"tane D harfi vardir");
	System.out.println(sayac4+"tane E harfi vardir");
	System.out.println(sayac5+"tane F harfi vardir");
	System.out.println(sayac6+"tane G harfi vardir");
	System.out.println(sayac7+"tane H harfi vardir");
	System.out.println(sayac8+"tane I harfi vardir");
		


	}

}
