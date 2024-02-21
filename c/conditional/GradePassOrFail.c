/*
 * "Create a programm that reads two grades: first semester's grade and second semester's grade.
 *  Then, print the final grade on screen. If final grade is under 60.0 points, the student fails
 *  the subjetct. Display a message about student's situation." Problem by Nelio Alves.
 */

 #include<stdio.h>

 int main() {

    double firstGrade, secondGrade, finalGrade;
    const double MINIMUM_PASSING_GRADE = 60;

    printf("Insert first semester's grade: ");
    scanf("%lf", &firstGrade);

    printf("Insert second semester's grade: ");
    scanf("%lf", &secondGrade);

    finalGrade = firstGrade + secondGrade;

    printf("\nThe final grade is: %.1lf.\n", finalGrade);

    if ( finalGrade >= MINIMUM_PASSING_GRADE) {
        printf("PASS\n");
    }
    else {
        printf("FAIL\n");
    }

    return 0;
 }

