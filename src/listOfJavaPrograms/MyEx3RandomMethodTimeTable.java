package listOfJavaPrograms;

/********************************************************************************************************** 
*  Exercise Chapter3. Logic Program Control. 
*  Generate 2 random numbers from 1 to 10. Assign those random numbers 2 variables: maxRow and maxColumn.
*  Write a for loop and a while loop that will iterate through the rows from 1 to maxRow and through
*  the columns from 1 to maxColumn respectively.
*  
*  (Hint) - you need to code the while loop inside the for loop, or vise versa.
* 
*  @author Samuel Mayol 
*  @professor Sam Sultan
*  @course Intro. to Java INFO1-CE9238 / ELEC1-DC1007
*  @version 1.0                           
**********************************************************************************************************/
 public class MyEx3RandomMethodTimeTable { 
  
	/** 
	* main method which is automatically called by the JVM 
	* @param  args - String[] a String array 
	* @return none - No return value 
	* @throws none - Does not throw any exceptions   
	*/
		// main method
	    public static void main(String[] args) { 
			System.out.println("---------------------------------------------------------------------------");
	        System.out.printf("\n\t\t<< Random \'MULTIPLICATION TABLE\' (from 1 to 10) >>\n\n"); 
	        System.out.println("---------------------------------------------------------------------------");
			
	        /**
	         * NUMBER OF COLUMNS
	         */
			// call a method getRandom and generate random numbers from 1 to 10
			int maxColumn = getRandom(1, 10);			// 1 to 10
			System.out.printf("Columns: %d\n", maxColumn);
			
			/**
	         * NUMBER OF ROWS
	         */
			int maxRow = getRandom(1, 10);				// 1 to 10
			System.out.printf("Rows: %d\n",maxRow);
			
			/**
	         * PRINT COLUMNS <>
	         */
			// produce the column header from <1> to <10> (I used a for loop for this case)
			System.out.printf("\t"); 					// shift the column headers by 1 cell
			int varColumn;	// variable scope (created outer of the for loop, but inner of the main method)
							// that way I can use it inside of the inner for loop
			for  (varColumn = 1;  varColumn <= maxColumn;  varColumn++) {
				System.out.printf("\t<%d>", varColumn);
			}
			
			/**
	         * PRINT ROWS <>
	         */
			// produce the row header from <1> to <10> (I used a while loop for this case)
			int varRow = 1; 							// must have a starting point
			while  (varRow <= maxRow) {   				// the while test
				System.out.println();
				System.out.printf("\t<%d>", varRow); // This print the left row(s)
				
				/**
		         * PRINT THE INSIDE OF THE PRODUCT OF EACH ROW BY COLUMN
		         */
				// inner for loop, generate the product of row * column (each row is multiplied by each column)
				for  (int p = 1;  p <= (maxColumn );  p++) {  
					System.out.printf("\t %d", p * varRow);
				} 
				
				varRow++;  
				
			}											
			
					
		
		}
		// getRandom method to pass it the upper row and column
			
		static  int  getRandom( int min, int max) {
			int rand;										// Create a local variable
			rand = (int) (Math.random( ) * (max-min+1) );	// casting to int type
			rand = rand + min;
			return (rand);									// return the random num type int
		}		
}

