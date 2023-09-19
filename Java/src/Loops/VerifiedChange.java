/* "MAke a programm that reads the unit price of price of a product,
 * quantity bought and value paid by client. Display change's value. 
 * If amount paid is not enough, display a message informing how much
 * is pending."
 *          problem given By Nelio Alves
 */

package Loops;

import java.util.Locale;
import java.util.Scanner;

public class VerifiedChange {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome!");

        String verifyAnother;
        do {

            //asks and collects inputs
            System.out.println("\nPlease, insert the unit price:");
            double unitPrice = scanner.nextDouble();
            System.out.println("Now insert the quantity:");
            int quantity = scanner.nextInt();
            
            //calculates purchase's total
            double purchaseTotal = unitPrice * quantity;
            
            //asks and collects amount paid
            System.out.println("Insert the amount paid:");
            double amountPaid = scanner.nextDouble();

            //verifies if payment is sufficient and prints change or pending value
            if (amountPaid >= purchaseTotal) {
                double change = amountPaid - purchaseTotal;
                
                System.out.println("\nThe change value is $" + String.format("%.2f", change) + 
                                    ". Thanks for your purchase!\n");
            } 
            else {
            double  remainingValue = purchaseTotal - amountPaid;
            
            System.out.println("\nPlease, to complete payment $" + String.format("%.2f", remainingValue) + 
                                " are still needed.\n"); 
            }

            System.out.println("Do you wish to verify another change? (y/n):");
             scanner.nextLine();
             verifyAnother = scanner.nextLine();

        } while (verifyAnother.equalsIgnoreCase("y") );

        scanner.close();
    }
}