package com.product.java.core;

/*
1. public- Here public is an access specifier which allows thhe main method to be accessble everywhere.
2. static- static helps main method to get loaded without getting alled by any instance/object.
3. void- void clarifies that the main method will not return any value.
4. main- It's the name of the method.
5. String[] args- Here we are defining a String array to pass arguments at command line. args is the variable name of the String array. It can be changed to anything such as String [] a.
 */

/* Run as configuration and pass the program parameter or 
 * compile by javac CommandLineArgument.java
 * run by java CommandLineArgument nishi 1
 */



public class CommandLineArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Print the values :" +args[0] + args[1]);

	}

}
