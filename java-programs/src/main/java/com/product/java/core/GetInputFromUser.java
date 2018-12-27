package com.product.java.core;

import java.util.Scanner;

public class GetInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		num = scan.nextInt();
		
		System.out.println("You Entered " +num);

	}

}
