package com.class3;

public class PrimitiveCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	//byte-->short-->int-->long-->float-->double
		//widening or automatic or mplict casting
		byte b=127;
		int i=b;
		int num=123;
		double d1=num;
		System.out.println(d1);
		
		float ff=547.4f;
		double dd=ff;
		System.out.println(dd);
		
		double ddd=342444.4555;
		
		float fff=(float)ddd;
		System.out.println(ddd);
	
	//narrowing or emplicting or manual casting
	double d2=123.45;
	int n1=(int)d2;
	System.out.println(n1);
	
	
	int num3=789;
	byte bb=(byte)num3;
	System.out.println(bb);
	}
	
	
	
	
	
	
	

}
