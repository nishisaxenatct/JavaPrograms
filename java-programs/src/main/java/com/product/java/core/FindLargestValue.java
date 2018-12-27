package com.product.java.core;

public class FindLargestValue {
	
	public static void main(String[] args){
		
		int[] arr={28,3,15,9,17,4,23,2};
		
		int val=arr[0];
		
		int i;
		
		for(i=0;i<arr.length;i++){
			if(arr[i]>val){
				val=arr[1];
			}
		}
		
		System.out.println("Largest value in given Array " +val);
	}

}
