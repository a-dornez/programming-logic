/*
 * "Read a int number 'x', then display on screen it's multiplication table from 1 to 10".
 *          Problem given by Nelio Alves
 */

package Loops;

import java.util.Locale;
import java.util.Scanner;

public class MultiplicationTable {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nWelcome!\n");

        String calculateAnother;
        do {

            //reads input
            System.out.println("Insert a int number to calculate it's multiplication table:");
            int inputNumber = scanner.nextInt();
            
            //calculates multiplication table
            for ( int i = 1; i <= 10; i ++ ) {
                int product = inputNumber * i;
                
                System.out.println( inputNumber + " x " + i + " = " + product );
            }
            
            //asks if user wants to execute another calculation
            System.out.println("Do you want to calculate another multiplication table? (y/n): ");
             scanner.nextLine();
             calculateAnother = scanner.nextLine();
            
        } while ( calculateAnother.equalsIgnoreCase("y") );

        scanner.close();
    }
}