/*
 * "Make a program that reads a int 'N' number (up to 10) and them reads 'N' it numbers and allocates them in
 * an array. Then, print on screen all negative numbers read."
 *   -- problem by Nelio Alves
 */

package arrays;

import java.util.Scanner;

public class negativeInputNumbers {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome!\nHow many int numbers will you insert?: ");
		 int inputsQuantity = scanner.nextInt();
		
		int negativeNumbersCounter = 0;
		int[] inputedNumbers = new int[10];
		for ( int i = 0; i < inputsQuantity; i++ ) {
			System.out.print("Insert a int number: ");
			 inputedNumbers[i] = scanner.nextInt();
			
			if ( inputedNumbers[i] < 0 ) { negativeNumbersCounter++; }
		}
		
		//checks if search is unnecessary
		if ( negativeNumbersCounter > 0 ) {
			System.out.println("Negative numbers:");
			for (int i = 0; i < inputsQuantity; i ++) {
				if ( inputedNumbers[i] < 0 ) {
					System.out.println("  " + inputedNumbers[i] );
				}
			}
		} else {
			System.out.println("There are no negative values");
		}
		scanner.close();
	}

}

