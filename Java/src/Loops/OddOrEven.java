/*
 * 
 */

package Loops;

import java.util.Scanner;

public class OddOrEven {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("How many values will you insert?: ");
		 int inputsQuantity = scanner.nextInt();
		
		for ( int i = 1; i <= inputsQuantity; i++ ) {
			
			System.out.print("\nPlease, insert an int value: ");
			 int numberX = scanner.nextInt();
			
			
			//determines value's polarity
			if ( numberX == 0 ) {
				System.out.print("Null");
			} else if ( numberX > 0 ) {
					System.out.print("Positive ");
			} else {
				System.out.println("Negative ");
			}
			
			//determines if value is odd or even
			if ( numberX % 2 == 0 && numberX != 0 ) {
				System.out.print("Even");
			} else if ( numberX != 0 ) {
				System.out.print("Odd");
			}
		}
		
		scanner.close();
	}
}
