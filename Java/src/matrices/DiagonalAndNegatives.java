/*
 * "Diagonal-Negatives. Make a program that reads an integer number N (max. value == 10)
 * and creates an square matrix that stores integer values. Then, display the values allocated
 * in the main diagonal and how many negative values are allocated in the matrix."
 *  -- Problem by Nelio Alves
 */

package matrices;

import java.util.Scanner;

public class DiagonalAndNegatives {
	
	public static void main (String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		int[][] matrix = new int[9][9];
		
		System.out.print("\nWelcome!\nWhat will be the square matrix dimension?(up to 10): ");
		 int usedDimension = scanner.nextInt();
		
		int negativeValuesCounter = 0;
		//iterates through matrix positions to assign values
		for ( int i = 0; i < usedDimension; i++ ) {
			for ( int j = 0; j < usedDimension; j++ ) {
				System.out.printf("Insert a value for position [%d,%d]: ", i,j);
				 matrix[i][j] = scanner.nextInt();
				
				//checks negative values quantity
				if ( matrix[i][j] < 0 ) {
					negativeValuesCounter++;
				}
			}
		}
		
		System.out.println("\nMain Diagonal:");
		//prints values assigned to main diagonal positions
		for ( int i = 0; i < usedDimension; i++ ) {
			System.out.print(" " + matrix[i][i] + "  ");
		}
		System.out.println("\nNegative values quantity: " + negativeValuesCounter);
		
		scanner.close();
	}
}

