/* 
* "Read an undetermined amount of int values X and Y. Print for each pair
* wether the were inserted in ascending or descending order. If the values
* are equal, termiante execution."
*       -- Problem by Nelio Alves
*/

using System;
using System.Runtime.CompilerServices;

namespace AscendingOrDescending 
{
    class AscendingOrdDescending 
    {
        static void Main(string[] args) 
        {
            int firstX, secondY;
            string order;

            do {
                Console.Write("Enter an integer value x: ");
                firstX = int.Parse(Console.ReadLine());
                Console.Write("Enter an integer value y: ");
                secondY = int.Parse(Console.ReadLine());

                if ( firstX < secondY ) {
                    order = "Ascending order";

                }
                else if (firstX > secondY ) {
                    order = "Descending order";
                }
                else {
                    order = "X and Y are equal values. Terminating execution";
                }

                Console.WriteLine("\n" + order +"\n");

            } while ( firstX != secondY );
        }
    }
}
