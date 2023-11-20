/* "Create a programm that reads two grades: first semester's grade and second semester's grade.
 * Then, print the final grade on screen. If final grade is under 60.0 points, the student fails
 *  the subjetct. Display a message about student's situation." Problem by Nelio Alves.
 */

 package loops;

 import java.util.Locale;
 import java.util.Scanner;

 public class GradePassOrFail{

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSalutations!\n");

        String verifyAnother;

        do {
             
        	System.out.println("Please, insert the first semester's grade: ");
             double firstSemesterGrade = scanner.nextDouble();
            
            //validates user input 
        	while ( 0 > firstSemesterGrade || firstSemesterGrade > 100 ) {
        		System.out.println("Please, insert a valid grade value (0 ~ 100): ");
        		 firstSemesterGrade = scanner.nextDouble();
        	}
            
            System.out.println("\nNow, insert the second semester's grade: ");
             double secondSemesterGrade = scanner.nextDouble();
            
            //validates user input 
            while ( 0 > secondSemesterGrade || secondSemesterGrade > 100 ) {
         		System.out.println("Please, insert a valid grade value (0 ~ 100): ");
         		 secondSemesterGrade = scanner.nextDouble();
         	} 
            
            //calculates final grade
            double finalGrade = firstSemesterGrade +  secondSemesterGrade;

            //prints final grade
            System.out.println("\nThe final grade is " + String.format("%.1f", finalGrade) + ".");

            final int MINIMUM_PASSING_GRADE = 60;
            if ( finalGrade >= MINIMUM_PASSING_GRADE ) {
                System.out.println("\nPASS. Final grade meets the requirements.\n");
            } else {
                System.out.println("\nFAIL. Final grade is under the minimum required: " + MINIMUM_PASSING_GRADE + ".\n");
            }
            
            System.out.println("Do you wish to verify another student's status?  ");
             scanner.nextLine();
             verifyAnother = scanner.nextLine();

        }while( verifyAnother.equalsIgnoreCase("y"));

         scanner.close();
    }
 }