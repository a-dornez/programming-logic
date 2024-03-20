/*
 * "Diagonal-Negatives. Make a program that reads an integer number N (max. value == 10)
 * and creates an square matrix that stores integer values. Then, display the values allocated
 * in the main diagonal and how many negative values are allocated in the matrix."
 *  -- Problem by Nelio Alves
 */

 #include<stdio.h>

 int main() {

    int matrix[10][10];
    int usedDimension;

    printf("What will be this square matrix dimension(up to 10): ");
    scanf("%d", &usedDimension);

    int negativeValuesCounter = 0;
    //collects input for matrix positions
    for ( int i = 0; i < usedDimension; i++ ) {
        for ( int j = 0; j < usedDimension; j ++ ) {
            printf("Insert int element [%d, %d]: ", i, j);
            scanf("%d", &matrix[i][j]);

            //checks if input value is negative
            if ( matrix[i][j] < 0 ) {
                negativeValuesCounter++;
            }
        }
    }

    printf("\nMain diagonal: ");
    for ( int i = 0; i < usedDimension; i++ ) {
        printf(" %d ", matrix[i][i]);
    }

    printf("\nNegative values counter: %d\n", negativeValuesCounter);

    return 0;
 }
