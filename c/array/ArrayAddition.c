/*
 * "Do a program that reads 'N' real numbers and stores them in an array. Then:
 *  -Print all array elements;
 *  -Print the sum and the average of all elements stored in the array
 *  		--problem by nelio Alves
 */

 #include<stdio.h>

 int main() {

    int arraySize = 0;

    printf("How many numbers you'll insert?: ");
    scanf("%d", &arraySize);

    double insertedNumbers[arraySize];

    //collecrs elements and sums them
    double arrayElementsSum = 0;
    for ( int i = 0; i < arraySize; i++ ) {
        printf("Insert #%d number: ",  (i+1) );
        scanf("%lf", &insertedNumbers[i]);

        arrayElementsSum += insertedNumbers[i];
    }

    double arrayElementsAverage = arrayElementsSum / arraySize;

    printf("\nArray elements: ");
    for ( int i = 0; i < arraySize; i++ ) {
        printf(" %.1f ", insertedNumbers[i]);
    }

    printf("\nElements sum: %.2f", arrayElementsSum);
    printf("\nElements average: %.2f\n", arrayElementsAverage);

    return 0;
 }
