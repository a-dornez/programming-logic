/*
 * "Make a program that reads 'N' int numbers and stores them in an array. Then, print on screen all
 * even numbers and their quantity."
 * 		--Problem by Nelio Alves 
 */

package arrays;

import java.util.Scanner;

public class EvenNumbers {
	
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome!\nHow many int numbers will you insert?: ");
		 int inputsQuantity = scanner.nextInt();
		
		int[] inputedNumbers = new int[inputsQuantity];
		int evenNumbersCounter = 0;
		for ( int i = 0; i < inputsQuantity; i++ ) {
			System.out.print("Insert an int number: ");
			 inputedNumbers[i] = scanner.nextInt();
			
			if ( inputedNumbers[i] % 2 == 0 ) {
				evenNumbersCounter++;
			}
		}
		
		System.out.print("\nEven numbers: ");
		if ( evenNumbersCounter > 0 ) {
			for ( int i = 0; i < inputsQuantity; i++) {
				if ( inputedNumbers[i] % 2 == 0 ) {
					System.out.print("  " + inputedNumbers[i] + "  ");
				}
			}
		} else {
			System.out.print("  There are no even numbers stored in this array.");
		}
		
		System.out.printf("\nEven numbers quantity: %d", evenNumbersCounter);
		
		scanner.close();
	}
}
