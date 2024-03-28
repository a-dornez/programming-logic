/*
 * "Do a program that reads 'N' real numbers and stores them in an array. Then:
 *  -Print all array elements;
 *  -Print the sum and the average of all elements stored in the array
 *  		--problem by nelio Alves
 */

 #include<iostream>
 #include<iomanip>

 using namespace std;

 int main() {

    int arraySize = 0;

    cout << "Please, insert how many numbers will be input: ";
    cin >> arraySize;

    double insertedNumbers[arraySize];

    //collects elements and sums them
    double arrayElementsSum = 0;
    for ( int i = 0; i < arraySize; i++ ) {
        cout << "Insert #" << i+1 << " number: ";
        cin >> insertedNumbers[i];

        arrayElementsSum += insertedNumbers[i];
    }

    double arrayElementsAverage = arrayElementsSum / arraySize;

    cout << "\nArray elements: ";
    for ( int i = 0; i < arraySize; i++ ) {
        cout << fixed << setprecision(1);
        cout << " " << insertedNumbers[i] << " ";
    }

    cout << fixed << setprecision(2);
    cout << "\nElements sum: " << arrayElementsSum;
    cout << "\nArray elements average: " << arrayElementsAverage << endl;

    return 0;
 }
