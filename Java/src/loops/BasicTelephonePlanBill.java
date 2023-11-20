/* "A telephone plan has a basic plan that gives user 100 minutes for $50.
 *  Each tresspassing minute that may occur costs additional $2. Make a programm
 * that reads how much minustes a person used and then print the bill's value."
 *      Prblem given by Nelio Alves
 */

package loops;

import java.util.Locale;
import java.util.Scanner;

public class BasicTelephonePlanBill {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome\n");
        System.out.println("We'll calculate a basic telephone plan bill:");
        
        String calculateAnother;

        do {
            //asks and collects user input
            System.out.println("Please, insert the amount of minutes used:");
            int minutesUsed = scanner.nextInt();
            
            int minutesExceded;
            double billsValue;
            final int STANDART_MINUTES_AMOUNT = 100;
            final double STANDART_BILL_VALUE = 50;
            final double EXTRA_VALUE_PER_MINUTE_EXCEDED = 2;
            
            //defines and prints bill's value
            if (minutesUsed <= STANDART_MINUTES_AMOUNT)
                System.out.println("\nBill's value is $" + String.format("%.2f", STANDART_BILL_VALUE) + ".\n");
            else {
                minutesExceded = minutesUsed - STANDART_MINUTES_AMOUNT;
                billsValue = STANDART_BILL_VALUE +  minutesExceded * EXTRA_VALUE_PER_MINUTE_EXCEDED;
                System.out.println("\nBasic plan minutes limit was exceded by " + minutesExceded +
                                    " minutes. For each minute exceded there's an extra tax of $" +
                                     String.format("%.2f", EXTRA_VALUE_PER_MINUTE_EXCEDED) +
                                    ". So,the bill's value is $" + String.format("%.2f", billsValue) + ".\n");
            }    
            
            System.out.println("Do you want to calculate another bill? (y/n)" );
            scanner.nextLine();
            calculateAnother = scanner.nextLine();

        }  while(calculateAnother.equalsIgnoreCase("y") );

     scanner.close();
    }

}