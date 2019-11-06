package com.class11;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] cars= {"mercedes","nissan","honda","toyota","audi","mitsubishi"};
		for(String car:cars) {
			
			System.out.println(car);
		}
		//second way
		for(int i=0; i<cars.length;i++) {
			
			System.out.println(cars[i]);
		}
	}

}
