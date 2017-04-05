package flowchartInProgramming;

import java.util.Scanner;

// Find all roots of a quadratic equation ax2 + bx + c = 0
// This program did not made to express values with imaginary numbers. 	i = Math.sqrt(-1);

public class RootsQuadraticEquation {
	
	private static Scanner input;

	public static void main(String[] args) {
		double a, b, c, y, z, x1, x2, discriminant;
		
		input = new Scanner(System.in);
		
		System.out.println("Introduce the value of \"a\" ");
		a = input.nextDouble();
		
		System.out.println("Introduce the value of \"b\" ");
		b = input.nextDouble();
		
		System.out.println("Introduce the value of \"c\" ");
		c = input.nextDouble();
		
				
		discriminant = Math.pow(b, 2) - 4 * (a * c); // This is the part that goes inside of the square root.
		
		System.out.println("Discriminant: " + discriminant);
		
		// This part help to fix the imaginary number expression
		y = Math.abs(discriminant); //converting discriminant into positive value, that way the square root works
		
		z = Math.sqrt(y); // The square root of y
		
		z = -(z); //converting back to negative the value of z
		
		
		x1 = (-b + z) / (2 * a);  // This is the square root values and -b divided by 2a
		x2 = (-b - z) / (2 * a);  // This is the square root values and -b divided by 2a
		
		System.out.println("Roots: \n x1= " + x1 + " \n x2= " + x2);
		
	}

}
