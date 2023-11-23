/*
 * "Do a program that reads name, age and height of a 'N' people amount.Then, display on screen the heights' average,
 * the percentage of people under 16 years old, and display the names of anyone if their age is bellow 16 years old."
 * 		--problem by Nelio Alves
 */

package arrays;

import java.util.Locale;
import java.util.Scanner;

public class BiometricData {
	
	public static void main (String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome!\nHow many people's information will you insert?: ");
		 int peopleQuantity = scanner.nextInt();
		
		String[] names = new String[peopleQuantity];
		int[] ages = new int[peopleQuantity];
		double[] heights = new double[peopleQuantity];
		double heightsSum = 0;
		int teenagersCounter = 0;
		final int TEENAGER_DETECTOR = 16;
		
		for ( int i = 0; i < peopleQuantity; i++ ) {
			System.out.printf("%nInsert name No%d: ", i+1);
			 scanner.nextLine();
			 names[i] = scanner.nextLine();
			System.out.printf("Insert age No%d: ", i+1);
			 ages[i] = scanner.nextInt();
			System.out.printf("Insert height No%d: ", i+1);
			 heights[i] = scanner.nextDouble();
			
			heightsSum += heights[i];
			if ( ages[i] < TEENAGER_DETECTOR ) {
				teenagersCounter++;
			}
		}
		
		double heightsAverage = heightsSum / peopleQuantity;
		double teenagersPercentage = (double) teenagersCounter / peopleQuantity * 100;
		
		System.out.printf("%nThis group height average is: %.2f", heightsAverage);
		System.out.printf("%nPeople  younger than %d years old percentage: %.2f\n", TEENAGER_DETECTOR,teenagersPercentage);
		
		for (int i = 0; i < peopleQuantity; i++ ) {
			if ( ages[i] < TEENAGER_DETECTOR ) {
				System.out.println("  " + names[i] );
			}
		}
		
		scanner.close();
	}
}

