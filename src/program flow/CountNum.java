/**
 * Demonstrate different program flows for,while,do..while 
 */
package programflow;

import java.util.Scanner;

public class CountNum {

	public static void main(String[] args) {
		int i, j, k;

		Scanner inp = new Scanner(System.in);
		System.out.print("Count up to? ");
		int start = inp.nextInt();
		inp.close();
		for (i = 1; i < start; i++) {
			/*
			 * i value executes until 29.
			 */
			System.out.println(i);
		}

		j = i; // j = 29
		while (j < i) { // 29 < 29? False //
			System.out.println(j);
			j++;
		}

		k = j; // k = 29;
		do {

			System.out.println("Last:" + k);
			k++; // 30

		} while (k < j);

	}

}
