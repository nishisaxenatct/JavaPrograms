package com.product.java.core;

import java.util.Scanner;

public class PrintTable {
	
	public static void main(String[] args){
		int i;
		Scanner n = new Scanner(System.in);
		System.out.println("Enter number :");
		int s = n.nextInt();
		for(i=1;i<=10;i++){
			
			System.out.println(s+"*"+i+"="+s*i);
		}
	}

}
