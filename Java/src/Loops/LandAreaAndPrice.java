/* A programm that receives a land's length, width, square meter's price ans then
 * prints land's area and total price. Problem given by Nelio Alves.
 */

package Loops;

import java.util.Locale;
import java.util.Scanner;

public class LandAreaAndPrice {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Greetings!");

        String calculateAnother;

        do {

            //Colecting user's inputs       
            System.out.println("Enter the land's length: ");
            double landsLength = scanner.nextDouble();
            System.out.println("enter the land's width: ");
            double landsWidth = scanner.nextDouble();
            System.out.println("Enter the square meter's price: ");
            double squareMeterPrice = scanner.nextDouble();

            //calculating land's total area
            double landsTotalArea = landsWidth * landsLength;

            //calculating land's total price
            double landsTotalPrice = squareMeterPrice * landsTotalArea;

            //Printing processed inputs to inform total price and total area
            System.out.println("\nThe land's total area is " + String.format("%.2f", landsTotalArea) +
            " m2, and it's total price is $" + String.format("%.2f", landsTotalPrice) + ".\n");

            System.out.println("Do you wish to execute another calculation? (y/n): ");
             scanner.nextLine();
             calculateAnother = scanner.nextLine();
        
        } while( calculateAnother.equalsIgnoreCase("y") ); 

        scanner.close();
    }
}