/* "Create a program that calculates a service provider's payment.
 * That programm must the user to input the provider's name, hourly rate
 * and worked hours. And then print the payment's value."
 *      -- Problem by Nelio Alves
 */

 #include<stdio.h>
 #include<string.h>

/*Function copied from instructor Nelio Alves (https://github.com/acenelio).
 *Reads a string input including whitespaces between words. In this case, it
 *allows the user to enter full names.
 */
void read_input(char *buffer, int length) {
    fgets(buffer, length, stdin);
    strtok(buffer, "\n");
}

 int main() {

    char employeeName[30];
    double hourlyRate = 0, workedHours = 0;

    printf("\nWelcome\nPlease insert the employee's name: ");
    read_input(employeeName, 30);
    printf("Now, insert their hourly rate: ");
    scanf("%lf", &hourlyRate);
    printf("Finally, insert their worked hours: ");
    scanf("%lf", &workedHours);

    double payment = hourlyRate * workedHours;

    printf("\nThe payment for %s must be $ %.2lf\n", employeeName, payment);

    return 0;
 }
