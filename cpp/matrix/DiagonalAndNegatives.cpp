/*
 * "Diagonal-Negatives. Make a program that reads an integer number N (max. value == 10)
 * and creates an square matrix that stores integer values. Then, display the values allocated
 * in the main diagonal and how many negative values are allocated in the matrix."
 *  -- Problem by Nelio Alves
 */

 #include<iostream>

using namespace std;

int main() {

    int matrix[10][10];
    int usedDimension;

    cout << "What will be this square dimension (up to 10)?: ";
    cin >> usedDimension;

    int negativeValuesCounter = 0;
    //collects input for matrix positions
    for ( int i = 0; i < usedDimension; i ++) {
        for ( int j = 0; j < usedDimension; j++ ) {
            cout << "Insert int element [" << i << ", " << j << "]: ";
            cin >> matrix[i][j];

            //checks if input value is negative
            if ( matrix[i][j] < 0 ) {
                negativeValuesCounter++;
            }
        }
    }

    cout << "\nMain diagonal: ";
    for ( int i = 0; i < usedDimension; i++ ) {
        cout << " " << matrix[i][i] << " ";
    }

    cout << "\nNegative values counter: " << negativeValuesCounter << endl;

    return 0;
}
