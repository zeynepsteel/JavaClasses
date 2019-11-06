package com.class11;

import java.util.Arrays;

public class ArrayManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] actualNames= {"Jhon", "Smith","Alex","Tanaz"};
        Arrays.sort(actualNames);
        
        String[] expectedNames= { "Smith","Jhon","Alex","Tanaz"};
        
        //To sort the elements of an Array
        Arrays.sort(expectedNames);
        
        System.out.println(Arrays.toString(actualNames));
        
        String actual=Arrays.toString(actualNames);
        String expected=Arrays.toString(expectedNames);
        
        System.out.println(actual.equals(expected));


	}

}
