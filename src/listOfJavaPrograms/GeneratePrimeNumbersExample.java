package listOfJavaPrograms;

import java.util.Scanner;

/*
Prime Numbers Java Example
This Prime Numbers Java example shows how to generate prime numbers
between 1 and given number using for loop.
 */

public class GeneratePrimeNumbersExample {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		
		System.out.println("Introduce the limit");
		int limit = input.nextInt();

		System.out.println("Prime numbers between 1 and " + limit);

		//loop through the numbers one by one
		for(int i=1; i < limit; i++){

			boolean isPrime = true;

			//check to see if the number is prime
			for(int j=2; j < i ; j++){

				if(i % j == 0){
					isPrime = false;
					break;
				}
			}
			// print the number
			if(isPrime)
				System.out.print(i + " ");
		}
	}
}
