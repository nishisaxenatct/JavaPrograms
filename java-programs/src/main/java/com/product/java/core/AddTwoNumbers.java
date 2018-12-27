package com.product.java.core;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, sum;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		n1= scan.nextInt();
		n2= scan.nextInt();
		
		sum = n1+n2;
		
		System.out.println("Sum of the Enetered two numbers : " +sum);
		

	}

}
