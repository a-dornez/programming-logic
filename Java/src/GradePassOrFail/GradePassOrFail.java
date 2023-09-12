/* "Create a programm that reads two grades: first semester's grade and second semester's grade.
 * Then, print the final grade on screen. If final grade is under 60.0 points, the student fails
 *  the subjetct. Display a message about student's situation." Problem by Nelio Alves.
 */

 package GradePassOrFail;

 import java.util.Locale;
 import java.util.Scanner;

 public class GradePassOrFail{

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nSalutations!\n");

        //Asks and collects user inputs
        System.out.println("Please, insert first semester's grade: ");
         double firstSemesterGrade = scanner.nextDouble();
        System.out.println("Now, insert th seond semester's grade: ");
         double secondSemesterGrade = scanner.nextDouble();
        
        double finalGrade = firstSemesterGrade +  secondSemesterGrade;

        System.out.println("\nThe final grade is " + String.format("%.1f", finalGrade) + ".");

        if ( finalGrade >= 60 )
            System.out.println("\nPASS. Final grade meets the requirements.\n");
        else
            System.out.println("\nFAIL. Final grade is under minimum required.\n");
        
        scanner.close();
    }
 }