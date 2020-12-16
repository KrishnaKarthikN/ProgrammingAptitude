package com.xworkz.primeNumbers;

public class PrimeNumbersUsingForLoop {

	public static void main(String[] args) {
		int  num = 59 ;
		int count = 1;
		for ( int i = 2 ; i < num ; i++ ) {
			if(num % i == 0 ) {
				count = 0;
			break;
			}
		}
		if (count==1)
			System.out.println(num + " Number is prime");
		else 
			System.out.println(num + " number is not prime");
		
	}

}
