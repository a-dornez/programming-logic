/*
 * "Make a programm that recieves 3 integer values as inputs and then
 * prints which is the smallest number."
 *      -- Problem by Nelio Alves
 */

#include<stdio.h>

int main() {

    int first, second, third;

    printf("Please, insert the first int number: ");
    scanf("%d", &first);
    printf("Now, insert trhe second number: ");
    scanf("%d", &second);
    printf("Finally, insert the third number: ");
    scanf("%d", &third);

    if ( ( first < second ) && ( first < third ) ) {
        printf("Smallest Number: %d\n", first);
    }
    else if ( second < third ) {
        printf("Smallest Number: %d\n", second);
    }
    else {
        printf("Smallest number: %d\n", third);
    }

    return 0;
}
