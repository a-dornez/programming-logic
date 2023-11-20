/*
 * "Read a integer value that represents how many tests will be run. Each test consists
 * in the weighetd average of three real numbers. Consider the fisrt value's weight is 2, 
 * second value's weight is 3 and third value's weight is 5."
 *      Problem given by Nelio Alves
 */

 package loops;

 import java.util.Locale;
 import java.util.Scanner;

 public class WeightedAverage {

    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nWelcome!\n");

        //reads how many tests will be run
        System.out.println("Insert the amount of tests that will be run: ");
         int testsQuantity = scanner.nextInt();

        final double FIRST_VALUE_WEIGHT = 2, SECOND_VALUE_WEIGHT = 3, THIRD_VALUE_WEIGHT = 5;
        final double WEIGHTS_SUM = FIRST_VALUE_WEIGHT + SECOND_VALUE_WEIGHT + THIRD_VALUE_WEIGHT;
        
        //calculates weighted average for tests cases
        for ( int i = 1; i <= testsQuantity; i ++ ) {
            System.out.println("Insert three real values:");
             double firstValue = scanner.nextDouble();
             double secondValue = scanner.nextDouble();
             double thirdValue = scanner.nextDouble();

            double weightedAverage = ( firstValue * FIRST_VALUE_WEIGHT + secondValue * SECOND_VALUE_WEIGHT + thirdValue * THIRD_VALUE_WEIGHT ) / WEIGHTS_SUM;

            System.out.println("Weighted average = " + String.format("%.3f",weightedAverage) + ".\n");
        }

        scanner.close();
    }
 }