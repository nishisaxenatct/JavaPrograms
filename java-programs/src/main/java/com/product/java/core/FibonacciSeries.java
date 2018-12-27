package com.product.java.core;

import java.util.Scanner;

public class FibonacciSeries {
	
	

	public static void main(String[] args){
		
		//Method 1
		
		/*int a = 0, b = 1, c, i, count = 10;
		
		
		//to print 0 and 1
		
		System.out.println(a + " " + b);
		
		//Loop Start from 2. We have already 0 and 1 printed in the previous step
		
		for(i=0;i<count;i++){
			
			c = a+b;
			System.out.println(" " + c);
			 a = b;
			 b = c;
		}*/
		
		//Method 2
		
		System.out.println("Enter the Ietration to Print Fibonacci Series :");
		
		FibonacciCheck.checkFibonacci(new Scanner(System.in).nextInt());
	}

}

class FibonacciCheck {
	 public static void checkFibonacci(int number){
	 int first=0,second=1;
	 int third=0;
	 int i=1;
	 System.out.print("Fibonacci Series upto: "+number+" is ");
	 System.out.print(first+","+second+",");
	 while(i<=number){
	 third=first+second;
	 System.out.print(third+",");
	 first=second;
	 second=third;
	 ++i;
	 }
	 }
	}
