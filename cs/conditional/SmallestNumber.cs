/*
 * "Make a programm that recieves 3 integer values as inputs and then
 * prints which is the smallest number."
 *      -- Problem by Nelio Alves
 */

 using System;

 namespace SmallestNumber 
 {
    class SmallestNumber 
    {
        static void Main (string[] args) 
        {
            Console.Write("Insert the first number: ");
            int first = int.Parse(Console.ReadLine());
            Console.Write("Insert the second number: ");
            int second = int.Parse(Console.ReadLine());
            Console.Write("Insert rthe third number: ");
            int third = int.Parse(Console.ReadLine());
            
            int smallestNumber;
            if ( ( first < second ) && ( first < third ) )  {
                smallestNumber = first;
            } 
            else if ( second < third ) {
                smallestNumber = second;
            }
            else {
                smallestNumber = third;
            }

            Console.WriteLine("\nSmallest number: " + smallestNumber + "\n");
        }
    }
 }
