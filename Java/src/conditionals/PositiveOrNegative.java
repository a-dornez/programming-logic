/*
 * "Write a program that asks and reads a numerical value and prints if it is negative or positive"
 *  --Problem at www.computersciencemaster.com/exercicios-if-else/
 */

package conditionals;

import java.util.Scanner;

public class PositiveOrNegative {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//asks and collects input
		System.out.print("Please, insert a positive or negative number: ");
		 double positiveOrNegativeNumber = scanner.nextDouble();
		
		//evaluates polarity 
		if ( positiveOrNegativeNumber >= 0 ) {
			System.out.println( positiveOrNegativeNumber + " is a positive number");
		}
		else {
			System.out.println( positiveOrNegativeNumber + " is a negative number");
		}
		
		scanner.close();
	}
}