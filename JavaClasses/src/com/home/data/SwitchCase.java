package com.home.data;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Bakiye goruntuleme");
		System.out.println("para yatirma");
		System.out.println("para cekme");
		System.out.println("cikis");
		int islem=scan.nextInt();
		
		
		double bakiye=5500;
		switch (islem) {
		
		case 1:
			System.out.println("bakiyeniz " + bakiye +" 'dir");
			break;
		case 2:
			System.out.println("ne kadar para yatiracaksiniz= ");
			double paraYat=scan.nextDouble();
			
			bakiye+=paraYat;
			System.out.println("bakiyeniz " + bakiye +" 'dir");
		break;
		case 3:
			System.out.println("ne kadar para cekiceksiniz= ");
			double paraCek=scan.nextDouble();
			
			bakiye-=paraCek;
			System.out.println("bakiyeniz " + bakiye +" 'dir");
			break;
		case 4:
			System.out.println("cikis");
			
			
		}
	}

}
