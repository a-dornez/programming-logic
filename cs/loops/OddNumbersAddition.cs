/*
 * "Make a program that reads two int values X and Y, in any order. Then, calculate and display
 * the sum of the odd numbers between X and Y."
 *   -- problem by Nelio Alves
 */

 using System;

 namespace OddNumbersAddition 
 {
    class OddNumbersAddition 
    {
        static void Main(string[] args) 
        {
            Console.Write("Please, insert an integer number X: ");
            int numberX = int.Parse(Console.ReadLine());
            Console.Write("Please, insert an integer number Y: ");
            int numberY = int.Parse(Console.ReadLine());

            int ensureAscendingOrder;
            if ( numberX > numberY ) {
                ensureAscendingOrder = numberX;
                numberX = numberY;
                numberY = ensureAscendingOrder;
            }

            int oddNumbersSum = 0;
            for ( int i = (numberX + 1); i < numberY; i++ ) {
                //checks if value is odd
                if ( i % 2 != 0 ) {
                    oddNumbersSum += i;
                }
            }

            Console.WriteLine("\nThe sum of odd values between X and Y is: " + oddNumbersSum + "\n");
        }
    }
 }
