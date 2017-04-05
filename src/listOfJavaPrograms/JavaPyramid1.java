package listOfJavaPrograms;

import java.util.Scanner;

/*
Java Pyramid 1 Example
This Java Pyramid example shows how to generate pyramid or triangle
like given below using for loop.

 *
 **
 ***
 ****
 *****
 */

public class JavaPyramid1 {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		String character = "";
		
		input = new Scanner(System.in);
		
		System.out.println("Introduce a character to create a pyramid");
		character = input.next();
		
		System.out.println("");
		
		for(int i=1; i<= 5 ;i++){
			for(int j=0; j < i; j++){
				System.out.print(character);
			}
			//generate a new line
			System.out.println("");
		}
	}
}