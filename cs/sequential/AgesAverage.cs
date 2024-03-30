/*
 * "Write a program that reads two people name and age. Then print a message showing these people's name
 * and the average age between them using a single decimal place."
 *      -- Problem by Nelio Alves
 */

using System;
using System.Globalization;

namespace AgesAverage 
{
    class AgesAverage 
    {
        static void Main(string[] args) 
        {
            CultureInfo CI = CultureInfo.InvariantCulture;

            Console.WriteLine("Enter first person data:");
            Console.Write("Name: ");
            string firtsPersonName = Console.ReadLine();
            Console.Write("Age: ");
            int firstPersonAge = int.Parse(Console.ReadLine());

            Console.WriteLine("Enter second person data:");
            Console.Write("Name: ");
            string secondPersonName = Console.ReadLine();
            Console.Write("Age: ");
            int secondPersonAge = int.Parse(Console.ReadLine());

            double agesAverage = (double) (firstPersonAge +  secondPersonAge) / 2;

            Console.WriteLine("\nThe average age between " + firtsPersonName + " and "
                        + secondPersonName + " is " + agesAverage.ToString("F2", CI) 
                        + " years old\n");
        }
    }
}
