/*
 * "Make program that reads a int value 'x' an indeterminate number of times (stops if value is 0).
 * For each 'x' value read, print the sum of it's five consecutive even numbers,including 'x' itself
 * if it's even."
 *   -- problem by Nelio Alves 
 */


package loops;

import java.util.Scanner;

public class ConsecutiveEvenNumbersAddition {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please, insert an int value: ");
		 int x = scanner.nextInt();
		  
		int evenConsecutivesSum = 0;  
		while ( x != 0 ) {
			if (x % 2 == 0) {
				evenConsecutivesSum = 5 * x + 20;
			} else {
				x++;
				evenConsecutivesSum = 5 * x + 20;
			}	
			
			System.out.println("The sum of the five consecutive even numbers is: " + evenConsecutivesSum);
			
			System.out.println("\nPlease, insert an int value: ");
			 x = scanner.nextInt();
		}
		
		scanner.close();
	}
}
