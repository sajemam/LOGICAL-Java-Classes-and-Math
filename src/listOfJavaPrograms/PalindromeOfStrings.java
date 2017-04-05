package listOfJavaPrograms;

import java.util.Scanner;

public class PalindromeOfStrings {
	
	private static Scanner in;

	public static void main(String args[]) {
	      String original, reverse = "";
	      in = new Scanner(System.in);
	 
	      System.out.println("Enter a string to check if it is a palindrome");
	      original = in.nextLine();
	 
	      int length = original.length();
	 
	      for ( int i = length - 1; i >= 0; i-- )
	         reverse = reverse + original.charAt(i);
	      /***
	       * charAt(int index)
	       * Returns the char value at the specified index.
	       */
	 
	      if (original.equals(reverse))
	         System.out.println(original + " string is a palindrome.");
	      else
	         System.out.println(original + " string is not a palindrome.");
	 
	}	

}
