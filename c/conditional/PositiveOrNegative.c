/*
 * "Write a program that asks and reads a numerical value and prints if it is negative or positive"
 *  --Problem at www.computersciencemaster.com/exercicios-if-else/
 */

#include<stdio.h>

int main() {

    double number = 0;

    printf("Insert a number: ");
    scanf("%lf", &number);

    if ( number >= 0 ) {
        printf("\n%.3lf is a positive number\n", number);
    }
    else {
        printf("\n%.3lf is a negative number\n", number);
    }

    return 0;
}
