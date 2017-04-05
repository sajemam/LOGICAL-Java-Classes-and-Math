package listOfJavaPrograms;

import java.util.Scanner;

/*
This program shows how to calculate
Factorial of a number.
*/
 public class NumberFactorial {
	 
	 private static Scanner input;

	 public static void main(String[] args) {
		 
		 input = new Scanner(System.in);
	
		 System.out.println("Enter a number");
		 
		 int number = input.nextInt();
		
		 /*
		 * Factorial of any number is! n.
		 * For example, factorial of 4 is 4*3*2*1.
		 */
		
		 int factorial = number;
		
		 for(int i =(number - 1); i > 1; i--)
		 {
			 factorial = factorial * i;
		 }
		
		 System.out.println("Factorial of a number is " + factorial);
	 }
 }