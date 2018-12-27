package com.product.java.core;

public class FibonacciSerieswithrecursion {
	
	static int n1=0, n2=1, n3=0;

	static void printFibonacci(int count) {
		// TODO Auto-generated method stub
		if(count>0){
			n3 = n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(" " +n3);
			printFibonacci(count-1);
		}

	}
	
	public static void main(String[] args){
		int count=10;
		System.out.println(n1+" "+n2); //print n1 and n2 value
		printFibonacci(count-2); //n-2 because 2 numbers are already printed  
	}

}
