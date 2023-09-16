/* "Make a programm that reads three int numbers and then print 
 * the smallest among them. If there is a draw, print only once."
 * Problem by Nelio Alves
*/

package SmallestNumberAmongThree;

import java.util.Locale;
import java.util.Scanner;

public class SmallestNumberAmongThree {
    public static void main (String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome!\n");
        System.out.println("We'll check the smallest number among three");

        //asks and collects user inputs
        System.out.println("Please, insert the first number: ");
         int firstNumber = scanner.nextInt();
        System.out.println("Now, insert the second number: ");
         int secondNumber = scanner.nextInt();
        System.out.println("Finally, insert the third number: ");
         int thirdNumber = scanner.nextInt();
        
        //compares numbers to define the smallest and print it 
        if ((firstNumber < secondNumber) || (firstNumber < thirdNumber ))
            System.out.println("\nThe smallest number is " + firstNumber + "\n");
        else {
            if (secondNumber < thirdNumber)
                System.out.println("\nThe smallest number is " + secondNumber + "\n");
            else {
                if (thirdNumber <= secondNumber)
                    System.out.println("\nThe smallest number is " + thirdNumber + "\n");
            }    
        }
        
        scanner.close();
    }
}