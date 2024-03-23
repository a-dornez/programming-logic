/*
 * Asks for a rectangle's width and height, calculates and
 * exhibits area, perimeter and diagonal values using 4 decimal places.
 */

#include<iostream>
#include<iomanip>
#include<cmath>

using namespace std;

int main() {

    cout << "Welcome!" << endl;

    double width, length;

    cout << "Enter rectangles width: ";
    cin >> width;
    cout << "Enter rectangles length: ";
    cin >> length;

    double rectangleArea = width * length;

    double rectanglePerimeter = 2 * ( length + width );

    double rectangleDiagonal = sqrt( length * length + width * width );

    cout << fixed << setprecision(4);
    cout << "\nRectangle's area is " << rectangleArea << ", it's perimeter is " << rectanglePerimeter << " and it's diagonal is " << rectangleDiagonal << endl;

    return 0;
}
