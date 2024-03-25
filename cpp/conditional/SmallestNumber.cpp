/*
 * "Make a programm that recieves 3 integer values as inputs and then
 * prints which is the smallest number."
 *      -- Problem by Nelio Alves
 */

 #include<iostream>

 using namespace std;

 int main() {

    int first, second, third;

    cout << "Insert the first number: ";
    cin >> first;
    cout << "Insert the second number: ";
    cin >> second;
    cout << "Insert the third number: ";
    cin >> third;

    if ( (first < second) && (first < third) ) {
        cout <<  "\nSmallest number: " << first << endl;
    }
    else if ( second < third ) {
        cout << "\nSmallest number: " << second << endl;
    }
    else {
        cout << "\nSmmallest Number: " << third << endl;
    }

    return 0;
 }
