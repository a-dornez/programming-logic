/* "Read an undetermined amount of int values X and Y. Print for each pair 
* wether the were inserted in ascending or descending order. If the values 
* are equal, termiante execution."
*   Problem by Nelio Alves
*/

package loops;

import java.util.Locale;
import java.util.Scanner;

public class AscendingOrDescending {

    public static void main (String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome!\n");

        System.out.println("Insert a int number 'x': ");
         int numberX = scanner.nextInt();
        System.out.println("Insert a int number 'y': ");
         int numberY = scanner.nextInt();
         
        while ( numberX != numberY ) {

            if ( numberX < numberY)
                System.out.println("\nAscending");
            else 
                System.out.println("\nDescending");

            System.out.println("\nIf you wish to terminate this execution, insert equal numbers.\n");
            
            System.out.println("Insert another int number 'x':");
             numberX = scanner.nextInt();
            System.out.println("Insert another number 'y': ");
             numberY = scanner.nextInt(); 
        } 

        System.out.println("\nX and Y are the same, terminating execution.\n");

        scanner.close();
    }
}
