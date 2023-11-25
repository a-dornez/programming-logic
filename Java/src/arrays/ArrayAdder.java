/*
 * "Make a program that reads 'N' int elements for arrays A and B. Then create another array C in which each element is the addition
 * of the values stored in the corresponding index of A and B."
 * 		--problem by Nelio Alves
 */

package arrays;

import java.util.Scanner;

public class ArrayAdder {
	
	public static void main (String[] main) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome\n How many int numbers will be in each array: ");
		 int numbersPerArray = scanner.nextInt();
		
		int[] A = new int[numbersPerArray];
		int[] B = new int[numbersPerArray];
		int[] C = new int[numbersPerArray];
		
		for ( int i = 0; i < numbersPerArray; i ++ ) {
			System.out.printf("\nPlease insert array A element No%d: ", i+1);
			 A[i] = scanner.nextInt();
		}
		
		for ( int i = 0; i < numbersPerArray; i ++ ) {
			System.out.printf("\nPlease insert array B element No%d: " , i+1);
			 B[i] = scanner.nextInt();
		}
		
		System.out.println("\n Resulting Array: ");
		for ( int i = 0; i < numbersPerArray; i++ ) {
			C[i] = A[i] + B[i];
			System.out.println("  "+ C[i]);
		}
		
		scanner.close();
	}
}
