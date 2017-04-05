package listOfJavaPrograms;

import java.util.Scanner;

/*
Java Pyramid 5 Example
This Java Pyramid example shows how to generate pyramid or triangle
like given below using for loop.

 12345
 1234
 123
 12
 1

 */

public class JavaPyramid5 {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		String character = "";
		
		input = new Scanner(System.in);
		
		System.out.println("Introduce a character to create a pyramid");
		character = input.next();
		
		System.out.println("");
		

		for(int i=5; i>0 ;i--){

			for(int j=0; j < i; j++){
				// If I do not comment any of these lines will print them mixed
				System.out.print(j+1); //If I comment this line it will print only the characters that I introduce
				System.out.print(character); // If I comment this line will print in sequence the number from 5 to 1
			}

			System.out.println("");
		}

	}
}
