/*
 * Asks for a rectangle's width and height, calculates and
 * exhibits area, perimeter and diagonal values using 4 decimal places.
 */

using System;
using System.Globalization;

namespace RectangleAreaPerimeterDiagonal 
    {
        class RecatangleProperties 
        {
            static void Main (string[] args) 
            {
                CultureInfo CI = CultureInfo.InvariantCulture;
                
                Console.WriteLine("Welcome!");

                Console.Write("Enter rectangle's width: ");
                double width = double.Parse(Console.ReadLine(), CI);
                Console.Write("Enter rectangle's length: ");
                double length = double.Parse(Console.ReadLine(), CI);

                double rectangleArea = width * length;
                double rectanglePerimeter = 2 * ( length + width);
                double rectangleDiagonal = Math.Sqrt( length * length + width * width);

                Console.WriteLine("\nRectangle's area is " + rectangleArea.ToString("F4", CI)
                                    + ", it's perimeter is  " + rectanglePerimeter.ToString("F4", CI)
                                    + " and it's diagonal is " + rectangleDiagonal.ToString("F4", CI)
                                    + "\n");
            }
        }
    }