package com.product.java.core;

import java.util.Scanner;

public class SortArray {
	
	public static void main(String args[]){
	
	int n, i, j, temp;
	
	int arr[] = new int[50];
	Scanner s = new Scanner(System.in);
	
	System.out.print("Enter total number of Element");
	n=s.nextInt();
	
	System.out.println("Enter " +n+ " Numbers :");
	for(i=0;i<n;i++){
		
		arr[i] = s.nextInt();
	}
	
	System.out.println("Sorting Array using Bubble sort technique...\n");
	for(i=0;i<(n-1);i++){
		
		for(j=0;j<(n-i-1);i++){
			
			if(arr[j] > arr[j+1]){
				
				temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				
			}
		}
	}
	
	System.out.println("Array sorted Sucessfully...\n");
	
	System.out.println("Sorted List in Ascending order : \n");
	
	for(i=0;i<n;i++){
		System.out.println(arr[i]+ " ");
	}
	}

}
