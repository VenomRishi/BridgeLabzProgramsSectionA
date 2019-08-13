/******************************************************************************
 *  Purpose: Program is written for finding Prime Factorial of number.
 *  		 
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   12-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.conditionalLoops;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeFactorial {

	public static void main(String[] args) {
		Utility utility=new Utility();
		Scanner scanner=new Scanner(System.in);
		int number,fact=1;
		
		System.out.println("Enter number");
		number=scanner.nextInt();
		
		for(int i=2;i*i<=number;i++) {
			if(utility.isPrime(i)){
				fact=fact*i;
				System.out.println("Factorial of number "+i+" is "+fact);
			}
		}
		
		scanner.close();
		

	}

}
