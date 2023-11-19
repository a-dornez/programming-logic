/*
 * "Write an algorithm that calculates an amount of divisions defined by the user. Each division will be
 * the first input by the second input. If the division is not possible, display a message 'Impossible
 * Division'."
 *  -- Problem by Nelio Alves
 */

package Loops;

import java.util.Locale;
import java.util.Scanner;

public class Division {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.print("How many times will you insert a int value?: ");
		 int inpustsQuantity = scanner.nextInt();
		
		for ( int i = 1; i <= inpustsQuantity; i++ ) {
			
			System.out.print("Please, insert the numerator: ");
			 double numerator = scanner.nextInt();
			System.out.print("Now, insert the denominator: ");
			 double denominator = scanner.nextInt();
			
			//validates input operation
			double division = 0;
			if ( denominator == 0 ) {
				System.out.println("Imposible Division\n");
			} else {
				division = numerator / denominator;
			}
			
			System.out.println("Division = " + division + "\n");
		}
		
		scanner.close();
	}
}
