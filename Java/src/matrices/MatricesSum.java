/*
 * "Write a program that reads two matrices 'A' and 'B' that store integer numbers,
 * collect the matrices number of rows 'M' and columns 'N'. Then, generate a third
 * matrix 'C', in which each element matches the sum of the respective values stored
 * in A and B. Finally, display 'C' on screen."
 *   -- Problem by Nelio Alves 
 */

package matrices;

import java.util.Scanner;

public class MatricesSum {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("\nWelcome\nPlease insert matrices number of rows (up to 10): ");
		 int rowsQuantity = scanner.nextInt();
		System.out.print("Please insert matrices number of columns (up to 10): ");
		 int columnsQuantity = scanner.nextInt();
		
		int[][] matrixA = new int[10][10];
		int[][] matrixB = new int[10][10];
		
		System.out.println("\nNow, please insert matrix A elements:");
		for ( int i = 0; i < rowsQuantity; i++ ) {
			for ( int j = 0; j < columnsQuantity; j++ ) {
				System.out.printf("  Element [%d, %d]: ", i, j);
				 matrixA[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("Please, insert matrix B elements:");
		for ( int i = 0; i < rowsQuantity; i++ ) {
			for ( int j = 0; j < columnsQuantity; j++ ) {
				System.out.printf("  Element [%d, %d]: ", i, j);
				 matrixB[i][j] = scanner.nextInt();
			}
		}
		
		//sums matrices
		int[][] matrixSumAB = new int [10][10];
		for ( int i = 0; i < rowsQuantity; i++ ) {
			for ( int j = 0; j < columnsQuantity; j++ ) {
				matrixSumAB[i][j] = matrixA[i][j] + matrixB[i][j]; 
			}
		}
		
		System.out.println("\nMatrix sum A and B:");
		for ( int i = 0; i < rowsQuantity; i++ ) {
			for ( int j = 0; j < columnsQuantity; j++ ) {
				System.out.print(" " + matrixSumAB[i][j] + " ");
			}
			System.out.print("\n");
		}
		
		scanner.close();
	}
}

