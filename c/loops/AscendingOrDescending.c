/*
* "Make a program that reads an undertermined amount of values 'x' and 'y'. Everytime those values are entered
* this program must print a mesage telling whether 'x' and 'y' were entered in ascending or descending order.
* When two equal values are entered, the program should be terminated."
*   -- Problem by Nelio Alves
*/

#include<stdio.h>

int main() {

  int first, second;

  while ( first != second ) {

    printf("\nEnter a integer value x: ");
    scanf("%d", &first);
    printf("Enter a integer value y: ");
    scanf("%d", &second);

    if ( first < second) {
      printf("\nx and y are in ascending order\n");
    }
    else if ( first > second ) {
      printf("\nx and y are in descending order\n");
    }
    else {
      printf("\nx and y are equal values. Terminating execution.\n");
    }

  }

  return 0;
}

