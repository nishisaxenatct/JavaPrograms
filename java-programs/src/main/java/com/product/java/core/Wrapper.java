package com.product.java.core;

/*
 * Wrapper class in java provides the mechanism to convert primitive into object and object into primitive.
 */

public class Wrapper {
	
	public static void main(String arg[]){
		 int i = 12345;
		 float x = 19.50f;
		 Integer j = Integer.valueOf(i);
		 Float y = x; //Autoboxing
		 System.out.println(j);
		 System.out.println(x); //
	}

}
