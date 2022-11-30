/**
 * Switch to selection. 
 * Choose the word that does not start and end in vowel letter 
 */
package programflow;

import java.util.Scanner;

public class WordChoice {

	public static void main(String[] args) {

		Scanner inp = new Scanner(System.in);
		System.out.println("Sample:\n cat\n iglu\n echo");
		System.out.println("Among list of words " + "cat is the word does not start and end in vowel.");
		System.out.println("Select number between 1 to 3? ");
		int userChoice = inp.nextInt();
		inp.close();
		switch (userChoice) {
		case 1:
			System.out.println("apple X");
			break;
		case 2:
			System.out.println("bag ✓");
			break;
		case 3:
			System.out.println("iglu X");
			break;
		default:
			System.out.println("No such options available");
		}
	}
}
