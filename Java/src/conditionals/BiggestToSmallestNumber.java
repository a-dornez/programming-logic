/*
 * "write a program that reads three numbers and prints them from biggest to smallest"
 *  --problem at www.computersciencemaster.com/exercicios-if-else/
 * 
 *  I feel I'm somehow brute-forcing this solution. I'll study ant try to find a better way. 
 *  
 *  I used conditions do validate in which order the biggest number was inserted, beginning from
 *  descending (3,2,1) order to ascending order (1,2,3).In this scenario, each number can occupy a 
 *  position up to 2 times (ex: 'a' can be the bigger while 'b' is the second biggest or c is the 
 *  second biggest). But, considering x! as the total number of combinations, meaning there are 6 
 *  different combinations in this scenario -- 24 if another position was added -- this solution
 *  is extremely inefficient. I believe using an array would be a better solution, thus I intend to
 *  study about and refactor this using a better strategy
 *  
 *  @author a-dornez
 *  @since 11, 14th, 2023 
 */

package conditionals;

import java.util.Scanner;

public class BiggestToSmallestNumber {
	
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Inser three distinct int numbers: ");
		 int a = scanner.nextInt();
		 int b = scanner.nextInt();
		 int c = scanner.nextInt();
		
		// a > b > c 
/*1*/	if ((a > b && a > c) && b > c ) {
			System.out.println("a: "+ a +" b: "+ b +" c : "+c);
		}
		// a > c > b
/*2*/	else if ((a > b && a > c) && c > b) {
			System.out.println("a: "+ a +" c: "+ c +" b: "+ b);
		}
		// b > a > c
/*3*/	else if ((b > a && b > c) && a > c) {
			System.out.println("b: "+ b +" a: "+ a +" c: "+ c);
		}
		// b > c > a
/*4*/	else if ((b > a && b > c) && c > a) {
			System.out.println("b: "+ b +" c: "+ c +" a: "+ a);
		}
		// c > a > b
/*5*/	else if ((c > a && c > b) && a > b) {
			System.out.println("c: "+ c +" a: "+ a +" b: "+ b);
		}
		// c > b > a
/*6*/	else if ((c > b && c > a) && b > a) {
			System.out.println("c: "+ c +" b: "+ b +" a: "+ a);
		}
		else {
			System.out.println("You must insert three distinc integers");
		}
		
		scanner.close();
	}
}
