package flowchartInProgramming;

import java.util.Scanner;

// The largest among three different numbers entered by the user.

public class LagerstOfThreeNumByEnteredByUser {
	
	private static Scanner input;

	public static void main(String[] args) {
		int a, b, c;
		input = new Scanner(System.in);
		
		System.out.println("Enter num1");
		a = input.nextInt();
		
		System.out.println("Enter num2");
		b = input.nextInt();
		
		System.out.println("Enter num3");
		c = input.nextInt();
		
		if (a > b) {
			if (a > c) {
				System.out.println("The greatest is: " + a);
			}
			else 
				System.out.println("The greatest is: " + c);
		}
		else if (b > c) {
			System.out.println("The greatest is: " + b);
		}
		else
			System.out.println("The greatest is: " + c);
	}

}
