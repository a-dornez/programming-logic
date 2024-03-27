/*
 * "Make a program that reads two int values X and Y, in any order. Then, calculate and display
 * the sum of the odd numbers between X and Y."
 *   -- problem by Nelio Alves
 */

 #include<iostream>

 using namespace std;

 int main() {

    int numberX, numberY;

    cout << "Please, insert a int number X: ";
    cin >> numberX;
    cout << "Please, insert a int number Y: ";
    cin >> numberY;

    int ensureAscendingOrder = 0;
    if ( numberX > numberY ) {
        ensureAscendingOrder = numberX;
        numberX = numberY;
        numberY = ensureAscendingOrder;
    }

    int oddNumbersSum = 0;
    for ( int i = (numberX+1) ; i < numberY; i++ ) {
        //checks if value is odd
        if ( i % 2 != 0) {
            oddNumbersSum +=i;
        }
    }

    cout << "\nThe sum of odd numbers between X and Y is: " << oddNumbersSum << endl;

    return 0;
 }
