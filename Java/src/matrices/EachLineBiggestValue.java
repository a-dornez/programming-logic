/*
 * "Each line biggest value. Read an integer value N and a N order square matrix. Then
 * display which is the biggest value stored in each line. Suppose
 *  there a are no repeated values."
 *    -- Problem by Nelio Alves
 */

package matrices;

import java.util.Scanner;

public class EachLineBiggestValue {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nWelcome!\nPlease, insert this matrix order (up to 10): ");
		 int matrixDimension = scanner.nextInt();
		
		int[][] matrix = new int[matrixDimension][matrixDimension];
		
		System.out.println("\nNow, insert this matrix elements: ");
		
		for ( int i = 0; i < matrixDimension; i++ ) {
			for ( int j = 0; j < matrixDimension; j++ ) {
				
				System.out.printf(" Insert the element [%d, %d]: ", i, j);
				 matrix[i][j] = scanner.nextInt();
			}
		}
		
		int[] eachLineBiggestValue = new int [matrixDimension];
		
		for ( int i = 0; i < matrixDimension; i++ ) {
			for ( int j = 0; j < matrixDimension; j++ ) {
				
				if ( matrix[i][j] > eachLineBiggestValue[i] ) {
					eachLineBiggestValue[i] = matrix[i][j];
				}
			}
		}
		
		
		System.out.println("\nEach line biggest element:");
		for ( int i = 0; i < matrixDimension; i++  ) {
			System.out.println("  " + eachLineBiggestValue[i] );
		}
		
		scanner.close();
	}
}

