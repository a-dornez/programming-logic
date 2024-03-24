/*
 * "Write a program that reads two people name and age. Then print a message showing these people's name
 * and the average age between them using a single decimal place."
 *      -- Problem by Nelio Alves
 */

#include<iostream>
#include<iomanip>
#include<climits>

using namespace std;

int main() {

    int firstPersonAge, secondPersonAge;
    string firstPersonName, secondPersonName;

    cout << "Insert first person's data: " << endl;
    cout << "Name: ";
    getline(cin, firstPersonName);
    cout << "Age: ";
    cin >> firstPersonAge;

    cout << "\nInsert the second person's data:" << endl;
    cout << "Name: ";
    cin.ignore(INT_MAX, '\n');
    getline(cin, secondPersonName);
    cout << "Age: ";
    cin >> secondPersonAge;

    double ageAverage = (double) (firstPersonAge + secondPersonAge ) / 2;

    cout << fixed << setprecision(1);
    cout << "\nThe average age between " << firstPersonName << " and " << secondPersonName
         << " is " << ageAverage << " years old" << endl;

    return 0;
}
