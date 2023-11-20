/*
 * "Read a int value 'N'. This value will be the quantity of times that int values 'x' will be read.
 * Then, display how many of those values were inside and out the interval [10,20]."
 *  -- Problem by Nelio Alves
 */

package loops;

import java.util.Scanner;

public class InOutInterval {
	
	public static void main (String [] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many int values you'll insert?: ");
		 int inputAmount = scanner.nextInt();
		
		int in = 0;
		int out = 0;
		for ( int i = 1; i <= inputAmount; i++ ) {
			
			System.out.print("Insert an int value: ");
			 int numberX = scanner.nextInt();
			
			final int MINIMUM_VALUE = 10;
			final int MAXIMUM_VALUE = 20;
			 
			if ( numberX < MINIMUM_VALUE || numberX > MAXIMUM_VALUE ) {
				out++;
			} else {
				in++;
			}
		}
		
		System.out.println("\n" + in + " In, " + out + " Out." );
		
		scanner.close();
	}
}
