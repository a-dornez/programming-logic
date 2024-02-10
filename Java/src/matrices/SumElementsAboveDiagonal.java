/*
 * "Read a number 'N' (up to 10) and a N order square matrix, that stores integer values. Display the sum value of the
 * elements above the matrix's main diagonal."
 *  -- Problem by Nelio Alves
 *  ---------------------------------------------------------------------
 *  The main diagonal elements have coordinates which the row number 'i' is equal to the column number 'j', the numbers
 *  above it follow the pattern 'i < j', where the row number 'i' is smaller than it's 'j' number. That being said, by
 *  using a conditional that filters only the values in the coordinates that matches this condition, we can sum up the
 *  values above main diagonal. 
 *  
 *  	[0,0][0,1][0,2][0,3]
 *  	[1,0][1,1][1,2][1,3]
 *  	[2,0][2,1][2,2][2,3]
 *  	[3,0][3,1][3,2][3,3]
 */

package matrices;

import java.util.Scanner;

public class SumElementsAboveDiagonal {
	
	public static void main (String[] args ) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nWelcome\nPlease insert the matrix order (up to 10): ");
		 int matrixDimension = scanner.nextInt();
		
		double[][] matrix = new double[10][10];
		
		System.out.println("\nPlease, insert matrix's elements:");
		for ( int i = 0; i < matrixDimension; i++ ) {
			for ( int j = 0; j < matrixDimension; j++ ) {
				System.out.printf("  Element [%d, %d]: ", i, j);
				 matrix[i][j] = scanner.nextInt();
			}
		}
		int elementsAboveDiagonalSum = 0;
		for ( int i = 0; i < matrixDimension; i++ ) {
			for ( int j = 0; j < matrixDimension; j++ ) {
				if ( i < j) {
					elementsAboveDiagonalSum += matrix[i][j];
				}
			}
		}
		
		System.out.print("\nElements above main diagonal sum: " + elementsAboveDiagonalSum + "\n");
		
		scanner.close();
	}
}

