package com.product.java.core;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		findPrimeNumber(51);

	}
	// Which divided by own
         public static void findPrimeNumber(int number){
        	 
     
        	int i;
        	for(i=2;i<=number/2;i++){
        		if(number%i==0){
        			System.out.println("is not a prime number" +number);
        			break;
        		}else{
        			System.out.println("is a prime number" +number);
        			break;
        		}
        	}
        		 
        		 
        	 
         }
}
