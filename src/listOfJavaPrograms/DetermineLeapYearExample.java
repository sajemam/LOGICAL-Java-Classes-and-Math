package listOfJavaPrograms;

import java.util.Scanner;

/*
Determine If Year Is Leap Year Java Example
This Determine If Year Is Leap Year Java Example shows how to
determine whether the given year is leap year or not.
 */

public class DetermineLeapYearExample {
	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		//year we want to check
		System.out.println("Enter the year you want to check");
		int year = input.nextInt();
		//if year is divisible by 4, it is a leap year
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
		System.out.println("Year " + year + " is a leap year");
		else
			System.out.println("Year " + year + " is not a leap year");
	}
}