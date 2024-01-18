/*
 * "There's a data collection about height and gender (F/M) of a N amount of people. Write a program
 * that calculates and prints this group's hightest and lowest heights, the woman's heights average
 * and the number of men."
 *  -- problem by Nelio Alves
 */

package arrays;

import java.util.Scanner;
import java.util.Locale;

public class PeopleData {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Welcome!\nHow many people data will be inserted?: ");
		 int peopleQuantity = scanner.nextInt();
		
		double[] heights = new double[peopleQuantity];
		String[] genders = new String[peopleQuantity];
		
		int womanCounter = 0;
		int manCounter = 0;
		double womanHeightsSum = 0;
		for ( int i = 0; i < peopleQuantity; i++ ) {
			System.out.printf("Please, insert the person No%d height: ", i + 1 );
			 heights[i] = scanner.nextDouble();
			System.out.printf("Please, insert the person No%d gender: ", i + 1);
			 scanner.nextLine();
			 genders[i] = scanner.nextLine();
			
			if ( genders[i].equalsIgnoreCase("F") ) {
				womanCounter++;
				womanHeightsSum += heights[i];
			} else {
				manCounter++;
			}
		}
		
		double highestHeight = heights[0];
		double lowestHeight = heights[0];
		for ( int i = 1; i < peopleQuantity; i++ ) {
			if (heights[i] > highestHeight ) {
				highestHeight = heights[i];
			}
			if (heights[i] < lowestHeight) {
				lowestHeight = heights[i];
			}
		}
		
		double averageWomanHeight = womanHeightsSum / womanCounter;
		
		System.out.println("\nHeighest height: " + highestHeight + ", lowest height: " + lowestHeight + "\nAverage woman height: " + 
				String.format("%.2f", averageWomanHeight ) +  "\nMan quantity: " + manCounter);
		
		scanner.close();
	}
}

