package listOfJavaPrograms;

import java.util.Scanner;

/**
		int[] array
		
		// is equivelant to
		
		int array[]
		
		int var, array[]
		
		// is equivelant to
		
		int var;
		int[] array;
		
		int[] array1, array2[]
		
		// is equivelant to
		
		int[] array1;
		int[][] array2;

 */


/*
This program shows how to check for in the given list of numbers
whether each number is palindrome or not
 */
public class JavaPalindromeNumberExample {

	private static Scanner input;

	public static void main(String[] args) {

		System.out.println ("how many number you want to put in the array?");
		input = new Scanner(System.in);
		int num = input.nextInt();
		int numbers[] = new int[num];
		
		//iterate through the numbers
		for(int i = 0; i < numbers.length; i++){
			int index = 1;
			index += i;
			System.out.print("\nIntro the number for array(" + index + ") ");
			numbers[i] = input.nextInt();
			
			int number = numbers[i];
			int reversedNumber = 0;
			int temp=0;

			/*
			 * If the number is equal to it's reversed number, then
			 * the given number is a palindrome number.
			 *
			 * For ex,121 is a palindrome number while 12 is not.
			 */
			//reverse the number

			while(number > 0){
				temp = number % 10;
				number = number / 10;
				reversedNumber = reversedNumber * 10 + temp;
			}

			if(numbers[i] == reversedNumber)
				System.out.println(numbers[i] + " is a palindrome");
			else
				System.out.println(numbers[i] + " is not a palindrome");
		}
		
		System.out.println("\nEnd INPUT");
		
	}

}

