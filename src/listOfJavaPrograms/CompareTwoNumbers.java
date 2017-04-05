package listOfJavaPrograms;

import java.util.Scanner;

/*
Compare Two Numbers Java Example
This Compare Two Numbers Java Example shows how to compare two numbers
using if else if statements.
*/
public class CompareTwoNumbers {
	
	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		//declare two numbers to compare
		System.out.println("Enter num1");
		
		int num1 = input.nextInt();
		
		System.out.println("Enter num2");
		int num2 = input.nextInt();
		
		if(num1 > num2){
			System.out.println(num1 + " is greater than " + num2);
		}
		else if(num1 < num2){

			System.out.println(num1 + " is less than " + num2);
		}
		else{
			System.out.println(num1 + " is equal to " + num2);
		}
	}
}
