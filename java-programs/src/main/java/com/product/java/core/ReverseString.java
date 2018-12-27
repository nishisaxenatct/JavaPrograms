package com.product.java.core;

public class ReverseString {
	
	public static void main(String[] args){
		
		/*StringBuffer a = new StringBuffer("Software testing Material");
		
		// use reverse() method to reverses string
		
		System.out.println(a.reverse());*/
		int i;
		String input = "Nishi Saxena";
		//StringBuilder input1 = new StringBuilder();
		/*input1.append(input);
		input1 = input1.reverse();
		System.out.println(input1.toString());*/
		//i = input.length();
		//System.out.println(i);
		for(i = input.length()-1; i>=0; i--){
	
		System.out.print(input.charAt(i));
		}
	}

}
