/*
 * "Read a square matrix of order 'N' (up to 10), that stores floating point values. 
 * Then, perform the following operations:
 * 		a) calculate and print every positive numbers sum;
 * 		b) read a row index and then display every value stored in it;
 * 		c) print the main diagonal elements;
 * 		d) modify the matrix by squaring every negative element in it. Then,
 * 		   print the modified matrix.
 * 
 *   -- Problem by Nelio Alves
 */

package matrices;

import java.util.Locale;
import java.util.Scanner;

public class MatrixVariedOperations {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double[][] matrix = new double[10][10];
		
		System.out.print("Which will the matrix order (up to 10): ");
		 int matrixOrder = scanner.nextInt();
		
		System.out.println("Please, insert matrix elements: ");
		for ( int i = 0; i < matrixOrder; i++ ) {
			for ( int j = 0; j < matrixOrder; j++ ) {
				System.out.printf("  Element[%d, %d]: ", i, j);
				 matrix[i][j] = scanner.nextDouble();
			}
		}
		
		//sums stored positive values
		double positiveValuesSum = 0;
		for ( int i = 0; i < matrixOrder; i++ ) {
			for ( int j = 0; j < matrixOrder; j++ ) {
				if ( matrix[i][j] > 0 ) {
					positiveValuesSum += matrix[i][j];
				}
			}
		}
		
		System.out.println("Postive values sum: " + positiveValuesSum);
		
		//prints chosen row
		System.out.print("\nChoose a row: ");
		 int rowIndex = scanner.nextInt();
		System.out.print("Chosen row: ");
		for( int j = 0; j < matrixOrder; j++ ) {
			System.out.print(" " + matrix[rowIndex][j] + " ");
		}
		
		//prints chosen column
		System.out.print("\nChoose a column: ");
		 int columnIndex = scanner.nextInt();
		System.out.print("Chosen column: ");
		for ( int i = 0; i < matrixOrder; i++ ) {
			System.out.print(" " + matrix[i][columnIndex] + " ");
		}
		
		//prints main diagonal
		System.out.print("\nMain diagonal: ");
		for ( int i = 0; i < matrixOrder; i++ ) {
			for ( int j = 0; j < matrixOrder; j++ ) {
				if ( i == j ) {
					System.out.print(" " + matrix[i][j] + " ");
				}
			}
		}
		
		//squares negative values
		for ( int i = 0; i < matrixOrder; i++ ) {
			for ( int j = 0; j < matrixOrder; j++ ) {
				if (matrix[i][j] < 0 ) {
					matrix [i][j] *= matrix[i][j];
				}
			}
		}
		
		System.out.println("\nModified matrix:");
		for ( int i = 0; i < matrixOrder; i++ ) {
			for ( int j = 0; j < matrixOrder; j++ ) {
				System.out.print(" " + matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		scanner.close();
	}
}

