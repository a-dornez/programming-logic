/* "Write a programm that reads an indetermined amount of inputs for a passward
 * until a valid value is inserted. For each invalid input write a message 'Inavlid
 * password! Try again: '. when a correct value is inserted display a message 'Acess
 * Granted', then end execution. Consider the password is '2002'."
 *          Problem given by Nelio Alves
 */

package Loops;

import java.util.Locale;
import java.util.Scanner;

public class StaticPassword {
    public static void main (String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int password = 2002;

        System.out.println("\nWelcome\n");

        //reads first input
        System.out.println("Please, insert the password:");
         int userAttempt = scanner.nextInt();
        
        //validates input value
        while ( userAttempt != password ) {
            System.out.println("Invalid Password! try again:");
             userAttempt = scanner.nextInt();
        }
        
        System.out.println("Acess Granted");

        scanner.close();
    }   
}