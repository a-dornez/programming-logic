/* "Create a programm that reads three constants of a quadratic equation.
 * Use the quadratic formulo to calculate the x1 and x2 roots. If the equation
 * has no real roots, display a message.
 */

 package Conditionals;

 import java.util.Locale;
 import java.util.Scanner;

 public class QuadraticFormula {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome\n");
        System.out.println("Now, we'll calculate the solution to a quadratic equation 'ax^2 + bx + c = 0'.\n");
        
        //asks and collects user inputs
        System.out.println("Please, insert the 'a' constant: ");
         double a = scanner.nextDouble();
        System.out.println("Now, insert the 'b' constant: ");
         double b = scanner.nextDouble();
        System.out.println("Finally, insert the 'c' constant: ");
         double c = scanner.nextDouble();

        //calculates discrimant 
        double discriminant = ( b * b ) - 4 * a * c;

        //calculates and displays solutions based on disrimant value
        if (discriminant < 0)
            System.out.println("\nThis equation has no real roots. It's discrimant is bellow 0.\n");
        else {
            if (discriminant == 0) {
                double x1 = -b / 2 * a;

                System.out.println("\nThis equation has one real root:  " + String.format("%.4f", x1));
            }
            else {
                double x1 = (-b + Math.sqrt(discriminant)) / ( 2 * a );
                double x2 = (-b - Math.sqrt(discriminant)) / ( 2 * a );

                System.out.println("\nThis equation has two real roots. X1 is " + String.format("%.4f", x1) +
                                    " and X2 is " + String.format("%.4f", x2) + ".\n" );
            }
        }

        scanner.close();
    }
 }