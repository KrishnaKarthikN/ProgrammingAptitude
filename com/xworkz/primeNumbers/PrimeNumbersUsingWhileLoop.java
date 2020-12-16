package com.xworkz.primeNumbers;

public class PrimeNumbersUsingWhileLoop {

	public static void main(String[] args) {
		int  num = 59 ;
		int i = 2;
		int count = 1;
		while(i < num/2 && num%i ==0 ) {
			count = 0;
			i++;
			break;
		}
		if (count==1)
			System.out.println(num + " - Number is prime");
		else 
			System.out.println(num + " - Number is not prime");
		
	}

	
	
}
