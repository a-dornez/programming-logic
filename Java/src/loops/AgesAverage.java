/* "Create a programm that reads an indeterminate quantity of individuals ages.
 * When the user inserts a invalid age value (negative), finish execution. Then
 * display the ages average value. If the fisrt vaue inserted is negative, display
 * a messgae 'Invalid value'."
 *      Problem by Nelio Alves
 */

package loops;

import java.util.Locale;
import java.util.Scanner;

public class AgesAverage {
  public static void main (String[] args) {

    Locale.setDefault(Locale.US);
    Scanner scanner = new Scanner(System.in);

    System.out.println("\nWelcome!\n");
    
    //asks and collects first user input
    System.out.println("Now you'll insert the age of various individuals. Insert a negative value to stop execution.");
    System.out.println("Insert an age:");
     int age = scanner.nextInt();
    
    int agesSum = 0;
    int validAgesQuantity = 0;
    //calculates ages sum and valid entries quantity
    while ( age >= 0 ) {
      agesSum = agesSum + age;
      validAgesQuantity = validAgesQuantity + 1;

      System.out.println("Insert another age:");
       age = scanner.nextInt();
    }
    
    //calcualtes and prints ages average if age sum value is valid (positive)
    if ( agesSum > 0 ) {
      double agesAverage = (double) agesSum / validAgesQuantity;
      System.out.println("The ages average is: " + String.format("%.2f", agesAverage) + ".");
    }
    else{
      System.out.println("Invalid age value.");
    }

    scanner.close();
  }
}