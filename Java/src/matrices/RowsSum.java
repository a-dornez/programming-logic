/*
 * "Make a program that reads two integer numbers M and N (up to 10). Then, read a matrix which dimension is
 * M rows and N columns, meant to store floating point values. Finally, generate an array in which each element
 * corresponds to the sum of the elements in matrix rows."
 *   -- Problem by Nelio Alves 
 */

package matrices;

import java.util.Locale;
import java.util.Scanner;

public class RowsSum {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		double[][] matrix = new double[10][10];
		double[] rowsSum = new double[10];
		
		//validates inputed rows quantity
		int rowsQuantity = 0;
		do {
			System.out.print("\nHow many rows this matrix will be? (up to 10): ");
			 rowsQuantity = scanner.nextInt();
			
			if ( rowsQuantity <= 0 || rowsQuantity > 10 ) {
				System.out.println("Invalid input. You must insert a value between 1 and 10.");
			}
			
		} while (rowsQuantity <= 0 || rowsQuantity > 10);
		
		//validates inputed columns quantity
		int columnsQuantity = 0;
		do {
			System.out.print("\nHow many columns this matrix will be? (up to 10): ");
			 columnsQuantity = scanner.nextInt();
			 
			if ( columnsQuantity <=0 || columnsQuantity > 10 ) {
					System.out.println("Invalid input. You must insert a value between 1 and 10.");
			}
			
		} while ( columnsQuantity <= 0 || columnsQuantity > 10 );
		
		//collects and assigns values to matrix positions
		for ( int i = 0; i < rowsQuantity; i++ ) {
			System.out.printf("\nInsert row No%d elements:\n", i+1);
			for ( int j = 0; j < columnsQuantity; j++ ) {
				matrix[i][j] = scanner.nextDouble();
			}
		}
		
		//sums rows values
		rowsSum[0] = 0;
		for ( int i = 0; i < rowsQuantity; i++ ) {
			for ( int j = 0; j < columnsQuantity; j++ ) {
				rowsSum[i] += + matrix[i][j]; 
			}
		}
		
		System.out.println("\nGenerated array:");
		for ( int i = 0; i < rowsQuantity; i++ ) {
			System.out.println("  " + String.format("%.1f", rowsSum[i]) );
		}
		
		scanner.close();
	}
}

