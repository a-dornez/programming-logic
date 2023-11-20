/*
 * Problem Description:
 * "Mary has just started medical school and needs your help to organize some experiments of a laboratory she's an intern. 
 * She wants to know how many specimens and the percentage of each specimen type used until the year's end. This laboratory
 * in particular, uses three specimens' types: frogs, mices and rabbits. To collect this data, she knows exactly how many
 * experiments were performed, the specimen type used  and how many specimens were used in each experiment. Do a program
 * that reads a int value 'N' that indicates the following experiment cases that will be inserted. Each test case contains a 
 * number which indicates how many specimens were used in it and a letter ('R', 'F' or 'S') stating which specimen type 
 * was used (R: rabbit, M: mice, F: frog). Present how many specimens were used in total, each type's total amount used and
 *  the percentage of each type used. Present percentage using two decimal places."
 *   -- Problem by Nelio Alves
 */

package loops;

import java.util.Locale;
import java.util.Scanner;

public class ExperimentsReport {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please, insert how many experiments will be informed: ");
		 int experimentCases = scanner.nextInt();
		
		int specimensUsedInCase = 0;
		String specimenType;				//by using String instead of char, latter 'equalIgnoreCase' can be applied
		int rabbitsAmount = 0;
		int frogsAmount = 0;
		int micesAmount =0;
		
		for (int i = 1; i <= experimentCases; i++ ) {
			
			System.out.println("Case " + i);
			System.out.print("  How many specimens were used?: ");
			 specimensUsedInCase = scanner.nextInt();
			System.out.print("  Which type of specimen was used? ( R: rabbits, F: frogs, M: mices ): ");
			 scanner.nextLine();
			 specimenType = scanner.nextLine();
			
			//identifies specimen's type and calculates it's amounts
			if ( specimenType.equalsIgnoreCase("r") ) {
				rabbitsAmount = rabbitsAmount + specimensUsedInCase;
			} else if ( specimenType.equalsIgnoreCase("f") ) {
					frogsAmount = frogsAmount + specimensUsedInCase;
			} else if ( specimenType.equalsIgnoreCase("m") ) {
					micesAmount = micesAmount + specimensUsedInCase;
			} else {
				System.out.println("You must insert a valid specimen type identifier ( R: rabbits, F: frogs, M: mices ).");
			}
		}
		
		int totalSpecimensUsed = rabbitsAmount + frogsAmount + micesAmount;
		double rabbitsPecentage = (double) rabbitsAmount / totalSpecimensUsed * 100;
		double frogsPercentage = (double) frogsAmount / totalSpecimensUsed * 100;
		double micesPercentage = (double) micesAmount / totalSpecimensUsed * 100;
		
		System.out.println("\nFinal Report:\n" + "   Total specimens used: " + totalSpecimensUsed + "\n   Total rabbits used: " + rabbitsAmount +
						"\n   Total frogs used: " + frogsAmount + "\n   Total mices used: " + micesAmount + "\n   Rabbits percentage: " +
						String.format("%.2f", rabbitsPecentage) + "\n   Frogs percentage: " + String.format("%.2f", frogsPercentage)  +
						"\n   MicesPercentage: " + String.format("%.2f", micesPercentage) );
		
		scanner.close();
	}
}
