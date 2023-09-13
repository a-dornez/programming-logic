package RectangleAreaPerimeterDiagonal;
/* Asks for a rectangle's width and heigth, calculates and
 * exhibts area, perimeter and diagonal values using 4 decimal places.
 * 
 *  TODO: create a class 'GeometricalPropoerties' to contain gemotrical propoerties calculation methods
 * 
 */ 

import java.util.Locale;
import java.util.Scanner;

public class RectangleAreaPerimeterDiagonal {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("\nWelcome!\n");

        String calculateAnother;

       do {

            //asks for user inputs: width and heigth
            System.out.println("Enter rectangles width: ");
             double rectangleWidth = scanner.nextDouble();
            System.out.println("Enter rectangles height: ");
             double rectangleHeigth = scanner.nextDouble();

            //calculates rectangle's area
            double rectangleArea = rectangleWidth * rectangleHeigth;
                
            //calculates rectangles perimeter
            double rectanglePerimeter = (rectangleWidth + rectangleHeigth) * 2 ;

            //calculates rectangles diagonal using Pythagoras Theorem
            double rectangleDiagonal = Math.sqrt( rectangleWidth * rectangleWidth + rectangleHeigth * rectangleHeigth );    

            //prints results
            System.out.println("\nRectangles area is "+ String.format("%.4f", rectangleArea) + ", it's perimeter is " +
                                String.format("%.4f", rectanglePerimeter) + " and it diagonal is " +
                                String.format("%.4f", rectangleDiagonal) + ".\n" ); 

            System.out.println("Do you wish to calculate another rectangle's properties? (y/n): ");
             scanner.nextLine();
             calculateAnother = scanner.nextLine();

        } while (calculateAnother.equalsIgnoreCase("y"));

        scanner.close();         
    }
}
