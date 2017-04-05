package listOfJavaPrograms;

import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class SwooshGrid.
 */
public class SwooshGrid  {

	/** The input. */
	private static Scanner input;

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main (String[] args) {
		int size;    // size of the board

		input = new Scanner(System.in);

		System.out.println("Introduce value to define the size of the Smooth");
		size = input.nextInt();

		int maxColumn = drawSwoosh(size);

		int row = 0; 							// must have a starting point
		while  (row <= maxColumn) {   				// the while test
			System.out.println();

			/**
			 * PRINT THE INSIDE OF THE PRODUCT OF EACH ROW BY COLUMN
			 */
			// inner for loop, generate the product of row * column (each row is multiplied by each column)
			for  (int p = 1;  p <= (maxColumn );  p++) {  
				//System.out.printf("\t %d", p * row);
				System.out.print("x ");
			} 

			row++;  

		}		
	}


	/**
	 * Draw swoosh.
	 *
	 * @param width the width
	 * @return the int
	 */
	static  int  drawSwoosh(int width) {
		int rand;										// Create a local variable
		rand = (int) (Math.random( ) * (width+1) );	// casting to int type
		rand = rand + width;
		return (rand);									// return the random num type int
	}	

}


