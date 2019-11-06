package mathmethod;

import java.util.Scanner;

public class MathFonsion {

	public static void main(String[] args) {

		
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter two numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		
double result1=Math.pow(a, b);
double result2=Math.sqrt(a);

System.out.println(result1+"and"+result2);

	}

}
