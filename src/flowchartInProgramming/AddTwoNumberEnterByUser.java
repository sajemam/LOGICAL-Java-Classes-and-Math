package flowchartInProgramming;

import java.util.Scanner;

// Add to number entered by the user
 
public class AddTwoNumberEnterByUser {
	private static Scanner input;

	public static void main(String[] args) {
		int num1, num2, sum;
		
		input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		num1 = input.nextInt();
		
		System.out.println("Enter second number");
		num2 = input.nextInt();
		
		sum = num1 + num2;
		
		System.out.println("The result is: " + sum);
		
	}

}
