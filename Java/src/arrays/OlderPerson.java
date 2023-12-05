/*
 * "Make a program that reads an 'N' amount of people names and ages. Names and age must be stored in arrays. Then print on
 * screen the older person's name."
 * 		-- problem by Nelio Alves 
 */

package arrays;

import java.util.Scanner;

public class OlderPerson {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome!\nPlease insert how many ages will be inserted: ");
		 int inputsQuantity = scanner.nextInt();
		
		String[] names = new String[inputsQuantity];
		int[] ages = new int[inputsQuantity];
		
		for ( int i = 0; i < inputsQuantity; i++ ) {
			
			System.out.printf("Please insert the data of person No%d\n", i+1);
			System.out.print("Name: ");
			 scanner.nextLine();
			 names[i] = scanner.nextLine();
			System.out.print("Age: ");
			 ages[i] = scanner.nextInt();
		}
		
		int greatestAge = ages[0];
		int greatestAgePosition = 0;
		
		for ( int i = 1; i < inputsQuantity; i++ ) {
			if ( ages[i] > greatestAge ) {
				greatestAge = ages[i];
				greatestAgePosition = i;
			}
		}
		
		System.out.printf("Older person: %s\n", names[greatestAgePosition] );
		
		scanner.close();
	}

}
