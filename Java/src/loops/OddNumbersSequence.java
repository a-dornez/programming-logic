/*
 * "Make a program that reads an in value 'x',then display all odd numbers between 1 and 'x'.
 * Print one value per line, including 'x' itself if it's odd. "
 *  -- problem given by Nelio Alves 
 */


package loops;

import java.util.Scanner;

public class OddNumbersSequence {
	
	public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Insert an int number: ");
		 int x = scanner.nextInt();
		 
		System.out.println("The odd numbers from 1 to " + x + " are: ");
		
		//sets iteration for increment or decrement depending on x's value 
		if ( x >= 0) {	
			for ( int i = 1; i <= x; i++ ) {
				if ( i % 2 != 0 ) {
					System.out.println(i);
				}
			}
		} else {	
			for ( int i = 1; i >= x; i-- ) {
				if ( i % 2 != 0 ) {
					System.out.println(i);
				}
			}
		}
			
		scanner.close(); 
	}

}
