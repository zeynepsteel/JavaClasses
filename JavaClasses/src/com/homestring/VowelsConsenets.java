package com.homestring;

public class VowelsConsenets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="zeyenp celik 210";
		
		int sayacv=0;
		int sayacc=0;
		int sayacs=0;
		int sayacn=0;
		for(int i=0; i<str.length();i++) {
			
			
			if(str.charAt(i)=='a' ||str.charAt(i)=='e' || str.charAt(i)=='u' || str.charAt(i)=='o' || str.charAt(i)=='i') {
				sayacv+=1;
				
			}
			else if(str.charAt(i)==' ') {
				sayacs+=1;
			}
			else if(str.charAt(i)=='0' || str.charAt(i)=='1' || str.charAt(i)=='2') {
				sayacn+=1;
			}
			else {
				sayacc+=1;
			}
			
			
		
		}
		System.out.println("vovels"+sayacv);
		System.out.println("constenents"+sayacc);
		System.out.println("space"+sayacs);
		System.out.println("numbers"+sayacn);
		
	}

}
