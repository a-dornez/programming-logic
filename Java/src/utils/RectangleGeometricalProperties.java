/*
 * @name: RectangleGeometricalProperties
 * @author: a-dornez <https://github.com/a-dornez>
 * @version: 1.0, 21-mar-2024
 * @description: implemented this class to execute operations concerning a rectangles geometrical properties.
 * 		It is meant to make code reusable,'RectangleAreaPerimeterDiagonal.java' cleaner, practice OOP fundamentals and
 * 		methods/functions development.
 * 
 * 		I decided to make available two ways to use this class: one by using class attributes and other
 * 		by directly calling an specific method and passing it's arguments. This may be useful as it can be
 * 		more practical to use one or the other depending on each use case.
 */

package utils;

public class RectangleGeometricalProperties {
	
	private double rectangleHeight;
	private double rectangleWidth;
	private double rectangleArea;
	private double rectanglePerimeter;
	private double rectangleDiagonal;
	
	public RectangleGeometricalProperties(double rectangleHeight, double rectangleWidth) {
		this.rectangleHeight = rectangleHeight;
		this.rectangleWidth = rectangleWidth;
	}
	
	public RectangleGeometricalProperties() {}
	
	public double RectangleArea() {
		rectangleArea = rectangleHeight * rectangleWidth;
		return rectangleArea;
	}
	
	public double RectangleArea( double rectangleHeight, double rectangleWidth) {
		return rectangleHeight * rectangleWidth; 
	}
	
	public double RectanglePerimeter() {
		rectanglePerimeter = 2 * ( rectangleHeight + rectangleWidth);
		return rectanglePerimeter;
	}
	
	public double RectanglePerimeter( double rectangleHeight, double rectangleWidth ) {
		return 2 * ( rectangleHeight + rectangleWidth);
	}
	
	public double RectangleDiagonal() {
		rectangleDiagonal = Math.sqrt( rectangleWidth * rectangleWidth + rectangleHeight * rectangleHeight );
		return rectangleDiagonal;
	}
	
	public double RectangleDiagonal(double rectangleHeight, double rectangleWidth) {
		return Math.sqrt( rectangleWidth * rectangleWidth + rectangleHeight * rectangleHeight );
	}

	public double getRectangleHeight() {
		return rectangleHeight;
	}

	public void setRectangleHeight(double rectangleHeight) {
		this.rectangleHeight = rectangleHeight;
	}

	public double getRectangleWidth() {
		return rectangleWidth;
	}
	
	public void setRectangleWidth(double rectangleWidth) {
		this.rectangleWidth = rectangleWidth;
	}
	
	public double getRectangleArea() {
		return rectangleArea;
	}
	
	public double getRectanglePerimeter() {
		return rectanglePerimeter;
	}
	
	public double getRectangleDiagonal() {
		return rectangleDiagonal;
	}
	
	@Override
	public String toString() {
		return "Rectangle's area is " + String.format("%.4f", rectangleArea)
			+ ", it's perimeter is " + String.format("%.4f", rectanglePerimeter)
			+ " and it's diagonal is " + String.format("%.4f", rectangleDiagonal);
	}
	
}

