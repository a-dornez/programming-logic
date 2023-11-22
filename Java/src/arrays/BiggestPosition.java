/*
 * "Make a program that reads 'N' double numbers and stores them in a array. Then, show on screen (consider there are no identical values)
 * the biggest number in the array. Display also the biggest number's position (index), consider the first position is '0'."
 * 		--problem by Nelio Alves 
 */

package arrays;

import java.util.Locale;
import java.util.Scanner;

public class BiggestPosition {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome!\nHow many double numbers will you insert?: ");
		 int inputsQuantity = scanner.nextInt();
		
		double[] inputedNumbers = new double[inputsQuantity];
		
		for ( int i = 0; i < inputsQuantity; i++ ) {
			
			System.out.print("Insert a double number: ");
			 inputedNumbers[i] = scanner.nextDouble();
		}
		
		double biggestNumber = inputedNumbers[0];
		int biggestNumberPosition = 0;
		for ( int i = 1; i < inputsQuantity; i ++ ) {
			if ( inputedNumbers[i] > biggestNumber ) {
				biggestNumber = inputedNumbers[i];
				biggestNumberPosition = i;
			}
		}
		
		System.out.print("\nThe biggest number in this array is " + biggestNumber + ", and it's index is " + biggestNumberPosition + ".");
		
		scanner.close();
	}
}

