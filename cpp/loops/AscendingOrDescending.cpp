/* "Read an undetermined amount of int values X and Y. Print for each pair
* wether the were inserted in ascending or descending order. If the values
* are equal, termiante execution."
*   Problem by Nelio Alves
*/

#include<iostream>

using namespace std;

int main() {

    int first, second;

    while ( first != second ) {

        cout << "Enter a integer value x: ";
        cin >> first;
        cout<< "Enter a integer value y: ";
        cin >> second;

        if ( first < second ) {
            cout << "\nX and y are in ascending order\n" << endl;
        }
        else if ( first > second) {
            cout << "\nX and Y are in descending order\n" << endl;
        }
        else {
            cout << "\nX and Y are equal values. Terminating execution\n" << endl;
        }
    }

    return 0;
}
