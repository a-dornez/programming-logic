/*
 * "Do a program that reads an natural 'N' value (up to 15), then calculate and display 'N' factorial.
 *   -- Problem by Nelio Alves. 
 */

package loops;

import java.util.Scanner;

public class Factorial {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nWelcome!\n");
		System.out.print("Please, insert a natural number, up to 15,to calculate it's factorial: ");
		 int numberToCalculateFactorial = scanner.nextInt();
		
		int factorial = 1;
		
		if ( numberToCalculateFactorial >= 0 ) {
			
			System.out.print("\n" + numberToCalculateFactorial + "!: ");
			
			//calculates factorial
			for ( int i = numberToCalculateFactorial; i >= 1; i-- ) {
				
				factorial = factorial * i;
				
				if ( i > 1) {
					System.out.print( i + " * " );
				} else {
					System.out.print(i);
				}
			}
			
			System.out.print(" = " + factorial );
			
		} else {
			System.out.println("\nInserted value must be a Natural number.\n");
		}
		
		scanner.close();
	}
}