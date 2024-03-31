/*
 * "Do a program that reads 'N' real numbers and stores them in an array. Then:
 *  -Print all array elements;
 *  -Print the sum and the average of all elements stored in the array
 *  		--problem by nelio Alves
 */

 using System;
 using System.Globalization;

 namespace ArrayAddition 
 {
    class ArrayAddition 
    {
        static void Main(string[] args) 
        {
            CultureInfo CI = CultureInfo.InvariantCulture;

            Console.Write("Please, insert how many numbers will be input: ");
            int arraySize = int.Parse(Console.ReadLine());

            double[] insertedNumbers = new double[arraySize];

            //collects elements and sums them up
            double arrayElementsSum = 0;
            Console.Write("\n");
            for ( int i = 0; i < arraySize; i++ )  {
                Console.Write("Insert #" + (i+1) + " number: ");
                insertedNumbers[i] = double.Parse(Console.ReadLine(), CI);

                arrayElementsSum += insertedNumbers[i];
            }

            double arrayElementsAverage = arrayElementsSum / arraySize;

            Console.Write("\nArray elements: ");
            for ( int i = 0; i < arraySize; i++ ) {
                Console.Write(" " + insertedNumbers[i].ToString("F1", CI) + " ");
            }

            Console.WriteLine("\nElements sumn: " + arrayElementsSum.ToString("F2", CI));
            Console.WriteLine("Array elememts average: " + arrayElementsAverage.ToString("F2", CI) + "\n");
        }
    }
 }
