/* "Create a program that calculates a service provider's payment. 
 * That programm must the user to input the provider's name, hourly rate
 * and worked hours. And then print the payment's value."
 */

package sequential;

import java.util.Locale;

import java.util.Scanner;

public class PaymentWorkedHours{

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome!\n");

        //Asks and collects user inputs
        System.out.println("Insert the service provider's name: ");
         String providersName = scanner.nextLine();
        System.out.println("Insert the provider's hourly rate: ");
         double hourlyRate = scanner.nextDouble();
        System.out.println("Insert the provider's total worked hours: ");
         double workedHours = scanner.nextDouble();

        //calculates payment
        double payment = hourlyRate * workedHours;
        
        //Displays payment value
        System.out.println("\nThe payment for " + providersName + " is $" + String.format("%.2f", payment) +  ".\n" );

        scanner.close();
    }

}