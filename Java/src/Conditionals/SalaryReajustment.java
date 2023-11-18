/*
 *	"CSM inc. decided to give raise to it's employee's and they hired you to develop a program that calculates said readjusts.
 *	 
 *	"a. make a program that reads the salary of an employee and calculates it readjust based on the following criteria, taking
 *		the current salary as a base:
 *	"b. salaries up to $280.00 (including): 20% raise;
 *	"c. salaries between $280.00 and up to $700.00; 15% raise;
 *	"d. salaries between $700.00 and up to $1500.00: 10% raise;
 *	"e. salaries from S1500.00 and beyond: 5% raise;
 *			after calculating the new salary, print on screen:
 *	"a. salary before readjustment;
 *	"b. the percentage of raise applied;
 *	"c. raises value;
 *	"d. new salary."
 *		-- problem at www.computersciencemaster.com/exercicios-if-else/
 *	
 *
 *	---------------------SOLVING PROCESS------------------------------------------------------------------------------------------
 * 	I started with an objetcive "Calculate a salary reajustment based on current salary value", then proceded to write some steps
 *	to approch a solution:
 *		1. Read current salary;
 *		2. Compare to given salary ranges to find applicabel raise tax;
 *		3. Calculate readjustment;
 *		4. Print informations.
 *	Based on that, I sketched an if-else structure to find out the applicable raise tax and calculate the new salary. But I soon
 *	realized that there should be a better way, It would be more efficient to just figure out the said tax within the if-else 
 *	statements and let the new salary's calculation after them.Then, when I started coding I could use a single variable to receive
 *	the raise taxes and avoid unecessary repetition.
 *	-------------------------------------------------------------------------------------------------------------------------------
 */

package Conditionals;

import java.util.Locale;
import java.util.Scanner;

public class SalaryReajustment {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		//welcome message and input collection
		System.out.println("Welcome!\nYou must insert an employee's salary, then I'll calculate the reajust for you");
		System.out.println("\nPlease, insert a employee's salary: ");
		 double currentSalary = scanner.nextDouble();
		
		final double LOWEST_SALARY_RANGE = 280.00;
		final double MEDIUM_SALARY_RANGE = 700.00;
		final double HIGHEST_SALARY_RANGE = 1500.00;
		 
		final double LOWEST_SALARY_READJUST_TAX = 1.2;
		final double LOWER_INTERMEDIATE_SALARY_READJUST_TAX = 1.15;
		final double UPPER_INTERMEDIATE_SALARY_READJUST_TAX = 1.10;
		final double HIGHEST_SALARY_READJUST_TAX = 1.05;
		 
		//Determines which raise tax is applicable
		double appliedRaiseTax;
		if ( currentSalary <= LOWEST_SALARY_RANGE ) {
			appliedRaiseTax = LOWEST_SALARY_READJUST_TAX;
		}
		else if ( LOWEST_SALARY_RANGE < currentSalary && currentSalary <= MEDIUM_SALARY_RANGE ) {
			appliedRaiseTax = LOWER_INTERMEDIATE_SALARY_READJUST_TAX;
		}
		else if ( MEDIUM_SALARY_RANGE < currentSalary && currentSalary <= HIGHEST_SALARY_RANGE ) {
			appliedRaiseTax = UPPER_INTERMEDIATE_SALARY_READJUST_TAX;
		}
		else {
			appliedRaiseTax = HIGHEST_SALARY_READJUST_TAX;
		}
		
		//calculates new salary, raise value and converts raise tax to percentage format
		double newSalary = currentSalary * appliedRaiseTax;
		double raiseValue = newSalary - currentSalary;
		appliedRaiseTax = appliedRaiseTax * 100 - 100;
		
		System.out.println("\nThis employe's current salary is $" + String.format("%.2f", currentSalary) + ", applying a raise tax of " + String.format("%.2f", appliedRaiseTax) + "%, therefore icreasing $" + String.format("%.2f", raiseValue) + ", their new salary will be $" + String.format("%.2f", newSalary) + ".");
			
		scanner.close();
	}
}
