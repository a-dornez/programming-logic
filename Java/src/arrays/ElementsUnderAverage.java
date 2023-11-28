/*
 * "Make a program that reads an 'N' number that defines how many double numbers an array will receive.
 * Then, print the stored elements average using three decimal houses. Finally, display all stored elements
 * bellow that average, with a single decimal house.
 * 		-- problem by Nelio Alves
 */

package arrays;

import java.util.Locale;
import java.util.Scanner;
//import java.util.Arrays;						<-- would be used for an 'Arrays.toString()' if the elements under average were stored in a separate array  

public class ElementsUnderAverage {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome!\nPlease, insert how many numbers this array will receive: ");
		 int inputsQuantity = scanner.nextInt();
		
		double[] inputedNumbers = new double[inputsQuantity];
		double elementsSum = 0; 
		for ( int i = 0; i < inputsQuantity; i++ ) {
			System.out.print("Please, insert a double number: ");
			 inputedNumbers[i] = scanner.nextDouble();
			
			elementsSum += inputedNumbers[i];
		}
		
		double elementsAverage = elementsSum / inputsQuantity;
		System.out.println("\nArray elements average: " + String.format("%.3f", elementsAverage) );
		
		//double[] elementsUnderAverage = new double[inputsQuantity];
		System.out.println("Elements under average: ");
		for ( int i = 0; i < inputsQuantity; i++ ) {
			if ( inputedNumbers[i] < elementsAverage ) {
				System.out.println("  " + String.format("%.1", inputedNumbers[i]) );
			}
		}
		
		scanner.close();
	}
}

