package listOfJavaPrograms;

import java.util.Scanner;

/*
List Even Numbers Java Example
This List Even Numbers Java Example shows how to find and list even
numbers between 1 and any given number.
*/

public class ListEvenNumbers {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
	
		//define limit
		System.out.println("Enter the limit ");
		
		int limit = input.nextInt();
		
		System.out.println("Printing Even numbers between 1 and " +
		limit);
		
		for(int i=1; i <= limit; i++){
		
			// if the number is divisible by 2 then it is even
			if( i % 2 == 0){
				System.out.print(i + " ");
			}
		}
	}
}

