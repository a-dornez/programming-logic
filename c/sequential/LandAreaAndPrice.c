/* A programm that receives a land's length, width, square meter's price ans then
 * prints land's area and total price.
 *      -- Problem given by Nelio Alves.
 */

#include<stdio.h>
#include<stdlib.h>

int main() {

    double width = 0, length = 0, squareMeterPrice = 0;

    printf("Welcome\nPlease insert the land's width: ");
    scanf("%lf", &width);
    printf("Now, insert the land's length: ");
    scanf("%lf", &length);
    printf("Finally, insert the square meter price: ");
    scanf("%lf", &squareMeterPrice);

    double area = width * length;
    double landPrice = squareMeterPrice * area;

    printf("\nThis land's area is: %.2lf", area);
    printf("\nAnd it's price is: %.2lf\n", landPrice);

    return 0;
}
