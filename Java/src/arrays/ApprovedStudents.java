/*
 * "Make a program that reads a set of 'N' elements of students names, first and second semesters grades. These informations should be stored 
 * in their own array. Then, print only the names of the approved students, considering approved a student that has a grade average of at least
 * 6.0 points."
 * 		-- Problem by Nelio Alves
 */

package arrays;

import java.util.Locale;
import java.util.Scanner;

public class ApprovedStudents {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Welcome!\nHow many students' data will be inserted?: ");
		 int inputsQuantity = scanner.nextInt();
		
		String[] studentsName = new String[inputsQuantity];
		double[] firstSemesterGrades = new double[inputsQuantity];
		double[] secondSemesterGrades = new double[inputsQuantity];
		
		for ( int i = 0; i < inputsQuantity; i++ ) {
			System.out.printf("Please, insert the students' No%d name, first and second semesters grade:\n", i+1);
			 scanner.nextLine();
			 studentsName[i] = scanner.nextLine();
			 firstSemesterGrades[i] = scanner.nextDouble();
			 secondSemesterGrades[i]= scanner.nextDouble();
		}
		
		double gradesAverage = 0;
		final double MINIMUM_PASSING_AVERAGE = 6.0;
		
		System.out.println("\nApproved Students:");
		for ( int i = 0; i < inputsQuantity; i++ ) {
			gradesAverage = ( firstSemesterGrades[i] + secondSemesterGrades[i] ) / 2;
			
			if ( gradesAverage >= MINIMUM_PASSING_AVERAGE ) {
				System.out.println("  " + studentsName[i]);
			}
		}
		
		scanner.close();
	}
}

