/*
 * "Create a program that read an 'N' quantity of int numbers and stores them in a array. Then only calculate the even numbers
 * average and display it with a single decimal place. If there are no even numbers in the array display a message informing that
 * there are no even numbers stored."
 * 			-- Problem by Nelio Alves
 */

package arrays;

import java.util.Locale;
import java.util.Scanner;

public class EvenNumbersAverage {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome!\nPlease, insert how many numbers you will insert: ");
		 int inputsQuantity = scanner.nextInt();
		
		int[] inputedNumbers = new int[inputsQuantity];
		int evenNumbersSum = 0;
		int evenNumbersQuantity = 0;
		for ( int i = 0; i < inputsQuantity; i++ ) {
			System.out.print("Please, insert a int number: ");
			 inputedNumbers[i] = scanner.nextInt();
			
			if ( inputedNumbers[i] % 2 == 0 ) {
				evenNumbersSum += inputedNumbers[i];
				evenNumbersQuantity++;
			}
		}
		
		double evenNumbersAverage = (double) evenNumbersSum / evenNumbersQuantity;
		
		if ( evenNumbersSum == 0 ) {
			System.out.println("There are no even numbers stored in this array");
		} else {
			System.out.println("The average of the even numbers stored in this array is: " + String.format("%.1f", evenNumbersAverage) );
		}
		
		scanner.close();
	}
}

