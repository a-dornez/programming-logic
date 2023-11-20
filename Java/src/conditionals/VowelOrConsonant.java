/*
 * "Write a program that verifies if an entered letter is either a vowel or a consonant"
 *  --problem at www.computersciencemaster.com/exercicios-if-else/
 */

package conditionals;

import java.util.Scanner;

public class VowelOrConsonant {
	
		public static void main (String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Please,insert a letter: ");
			 char letter = scanner.nextLine().charAt(0);
			 
			if (letter == 'a'||letter == 'A' || letter == 'e'||letter == 'E'|| letter == 'i'|| letter == 'I'
					|| letter == 'o'||letter == 'O' || letter == 'u'||letter == 'U') {
				
				System.out.println(letter +" is a vowel.");
			}
			else {
				
				System.out.println(letter + " is a consonant");
			}
			
			scanner.close();
		}
}