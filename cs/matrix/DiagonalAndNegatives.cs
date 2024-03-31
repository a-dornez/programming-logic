/*
 * "Diagonal-Negatives. Make a program that reads an integer number N (max. value == 10)
 * and creates an square matrix that stores integer values. Then, display the values allocated
 * in the main diagonal and how many negative values are allocated in the matrix."
 *  -- Problem by Nelio Alves
 */

 using System;

 namespace DiagonalAndNegatives 
 {
    class DiagonalAndNegatives
    {
        static void Main(string[] args) 
        {
            int[,] matrix = new int[10,10];
            
            Console.Write("What will be this square matrix dimension (up to 10)?: ");
            int usedDimension = int.Parse(Console.ReadLine());

            int negativeValuesCounter = 0;
            Console.Write("\n");
            //collects input for matrix positions
            for ( int i = 0; i < usedDimension; i++ ) {
                for ( int j = 0; j < usedDimension; j++ ) {
                    Console.Write("Insert int element [" + i + ", " + j + "]: ");
                    matrix[i,j] = int.Parse(Console.ReadLine());

                    //checks if input value is negative
                    if ( matrix[i,j] < 0 ) {
                        negativeValuesCounter++;
                    }
                }
            }

            Console.Write("\nMain diagonal: ");
            for ( int i = 0; i < usedDimension; i++ ) {
                Console.Write(" " + matrix[i,i] + " ");
            }

            Console.WriteLine("\nNegative values quantity: " + negativeValuesCounter + "\n");
        }
    }
 }
