/*
 * "Do a program that reads 'N' real numbers and stores them in an array. Then:
 *  -Print all array elements;
 *  -Print the sum and the average of all elements stored in the array
 *  		--problem by nelio Alves 
 */

package arrays;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayAddition {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many double numbers will you input?: ");
		 int inputsQuantity = scanner.nextInt();
		
		double[] inputedNumbers = new double[inputsQuantity];					//search if this way of defining an array dimension is problematic 
		double sumArrayElements = 0;
		for (int i = 0; i < inputsQuantity; i++ ) {
			System.out.print("Insert the " + ( i+1 ) + " double number: ");			//interesting! as initially Locale was not defined to US
			 inputedNumbers[i] = scanner.nextDouble();								//Mismatch exception was thrown because decimal's
			sumArrayElements = sumArrayElements + inputedNumbers[i];				//were separated by a dot (8.3), while it was expecting
																					//a comma (8,3).Took me some time to realize!
		}
		
		double averageArrayElements = sumArrayElements / inputsQuantity;
		
		/* 
		System.out.print("Values in array: ");
		for ( int i = 0; i < inputsQuantity; i++ ) {
			System.out.print(" " + inputedNumbers[i] + " ");
		}
		*/
		
		System.out.println("\nArray's elements: " + Arrays.toString(inputedNumbers) );
		System.out.print("Array elements sum: " + String.format("%.2f", sumArrayElements) + "\n");
		System.out.println("Array elements average: " + String.format("%.2f", averageArrayElements) + "\n");
		
		scanner.close();
	}

}

