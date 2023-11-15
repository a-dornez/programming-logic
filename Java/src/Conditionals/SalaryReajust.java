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
 *	"a. salary before readjust;
 *	"b. the percentage of raise applied;
 *	"c. raises value;
 *	"d. new salary."
 *		-- problem at www.computersciencemaster.com/exercicios-if-else/
 *
 *	TODO: use constants to replace magical numbers;
 *	TODO: write about solving process
 */

package Conditionals;

import java.util.Locale;
import java.util.Scanner;

public class SalaryReajust {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Welcome!\nYou must insert an employee's salary, then I'll calculate the reajust for you");
		System.out.println("\nPlease, insert a employee's salary: ");
		 double currentSalary = scanner.nextDouble();
		
		double appliedRaiseTax; 
		if ( currentSalary <= 280.00 ) {
			appliedRaiseTax = 1.2;
		}
		else if ( 280.00 < currentSalary && currentSalary <= 700.00 ) {
			appliedRaiseTax = 1.15;
		}
		else if ( 700.00 < currentSalary && currentSalary <= 1500.00 ) {
			appliedRaiseTax = 1.10;
		}
		else {
			appliedRaiseTax = 1.05;
		}
		
		double newSalary = currentSalary * appliedRaiseTax;
		double raiseValue = newSalary - currentSalary;
		appliedRaiseTax = appliedRaiseTax * 100 - 100;
		
		System.out.println("\nThis employe's current salary is $" + String.format("%.2f", currentSalary) + ", applying a raise tax of " + 
				 appliedRaiseTax + "%, therefore icreasing $" + raiseValue + ", their new salary will be $" + String.format("%.2f", newSalary) + ".");
			
		scanner.close();
	}
}
