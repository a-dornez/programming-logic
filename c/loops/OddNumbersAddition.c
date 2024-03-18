/*
 * "Make a program that reads two int values X and Y, in any order. Then, calculate and display
 * the sum of the odd numbers between X and Y."
 *   -- problem by Nelio Alves
 */

 #include<stdio.h>

 int main() {

    int numberX, numberY;

    printf("Please, insert an integer number x: ");
     scanf("%d", &numberX);
    printf("Please, insert another integer number y: ");
     scanf("%d", &numberY);

    int ensuresAscendingOrder = 0;
    if ( numberX > numberY ) {
        ensuresAscendingOrder = numberX;
        numberX = numberY;
        numberY = ensuresAscendingOrder;
    }

    int oddNumbersSum = 0;
    for ( int i = (numberX + 1); i < numberY; i++ ) {
        //checks if value is odd
        if ( i % 2 != 0 ) {
            oddNumbersSum += i;
        }
    }

    printf("\nThe sum of odd numbers between x and y is: %d\n", oddNumbersSum);

    return 0;
 }
