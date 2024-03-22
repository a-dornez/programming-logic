/* Asks for a rectangle's width and height, calculates and
 * exhibits area, perimeter and diagonal values using 4 decimal places.
 * ---------------------------------------------------------------------
 * 21-mar-2024: implemented util class RectangleGeomaytricalProperties and
 * delegated rectangle properties operations to it
 */

package sequential;

import java.util.Locale;
import java.util.Scanner;

import utils.RectangleGeometricalProperties;

public class RectangleAreaPerimeterDiagonal {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome!");
		
		String calculateAnother;
		
		do {
			
			//asks for user inputs: width and height
			System.out.print("\nEnter rectangles width: ");
			double rectangleWidth = scanner.nextDouble();
			System.out.print("Enter rectangles height: ");
			double rectangleHeight = scanner.nextDouble();
			
			RectangleGeometricalProperties r = new RectangleGeometricalProperties(rectangleHeight, rectangleWidth);
			
			r.RectangleArea();
			r.RectanglePerimeter();
			r.RectangleDiagonal();
			
			System.out.println("\n" + r.toString() + "\n");
			
			System.out.println("Do you wish to calculate another rectangle's properties? (y/n): ");
			scanner.nextLine();
			calculateAnother = scanner.nextLine();
			
		} while (calculateAnother.equalsIgnoreCase("y"));
		
		scanner.close();
	}
}

