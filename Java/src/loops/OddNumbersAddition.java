/*
 * "Make a program that reads two int values X and Y, in any order. Then, calculate and display
 * the sum of the odd numbers between X and Y."
 *   -- problem by Nelio Alves
 */

package loops;

import java.util.Locale;
import java.util.Scanner;

public class OddNumbersAddition {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("Please insert a int number X: ");
		 int numberX = scanner.nextInt();
		System.out.print("Please insert a int number Y: ");
		 int numberY = scanner.nextInt();
		
		int placeholder = 0;
		//Ensures x and y are in ascending order
		if ( numberY < numberX ) {
			placeholder = numberX;
			numberX = numberY;
			numberY = placeholder;
		}
		
		int oddNumbersTotalSum = 0;
		for ( int i = numberX+1; i < numberY; i ++ ) {
			//checks odd values
			if ( i % 2 != 0) {
				oddNumbersTotalSum = oddNumbersTotalSum + i;
			}
		}
		
		System.out.println("\nThe sum of all odd number between " + numberX +  " and " + numberY + " is: " + oddNumbersTotalSum + ".\n" );
		
		scanner.close();
	}
}
