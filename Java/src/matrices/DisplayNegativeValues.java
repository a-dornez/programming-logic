/*
 * "Matrix-negatives. Read two numbers M and N (up to 10) and then read
 * a matrix[M][N] that stores integer values. Finally, display on screen
 * only the negative values stored in the matrix."
 *  -- Problem by Nelio Alves
 */

package matrices;

import java.util.Scanner;

public class DisplayNegativeValues {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] matrix = new int[10][10];
		
		//validates inputed rows quantity
		int rowsQuantity = 0;
		do {
			System.out.print("How many rows the matrix will have?(up to 10): ");
			 rowsQuantity = scanner.nextInt();
			
			if ( rowsQuantity <= 0 || rowsQuantity > 10 ) {
				System.out.println("Invalid input. You must insert a value between 1 and 10.\n");
			}
		} while ( rowsQuantity <= 0 || rowsQuantity > 10 );
		
		//validates inputed columns quantity
		int columnsQuantity = 0;
		do {
			System.out.print("How many columns the matrix will have?(up to 10): ");
			 columnsQuantity = scanner.nextInt();
			 
			if ( columnsQuantity <= 0 || columnsQuantity > 10 ) {
					System.out.println("Invalid input. You must insert a value between 1 and 10.\n");
			}
		} while ( columnsQuantity <= 0 || columnsQuantity > 10 );
		
		//collects values for matrix positions
		int negativesCounter = 0;
		System.out.print("\n");
		for ( int i = 0; i < rowsQuantity; i++ ) {
			for ( int j = 0; j < columnsQuantity; j++ ) {
				System.out.printf("Insert element [%d, %d]: ", i, j);
				 matrix[i][j] = scanner.nextInt();
				
				if ( matrix[i][j] < 0 ) {
					negativesCounter++;
				}
			}
		}
		
		//checks if there no stored negative values
		if ( negativesCounter == 0 ) {
			System.out.println("\nThere are no negative values stored in this matrix.\n");
		} else {
			
			//prints stored negative values
			System.out.println("\nNegative values:");
			for ( int i = 0; i < rowsQuantity; i++ ) {
				for ( int j = 0; j < columnsQuantity; j++ ) {
					if ( matrix[i][j] < 0 ) {
						System.out.printf("  %d\n", matrix[i][j]);
					}
				}
			}
		}
		
		scanner.close();
	}
}

