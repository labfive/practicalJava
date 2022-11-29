/**
 * Java program to determine leap year 
 */
package programflow;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		boolean leap = false; 
		Scanner inp = new Scanner(System.in);
		int y = inp.nextInt(); 
		inp.close();
	
		if(y % 4 == 0) {
			if(y % 100 == 0) {
				if(y % 400 == 0)
					// Test the century year 
					leap = true; 
				else 
					leap = false; 
			}
			// Test with non century year 
			else 
			leap = true;
		}
			else 
				leap = false; 
		// Program statement 
		if(leap) 
			System.out.println("the year is a leap year");
		else 
			System.out.println("The year is not a leap year");
	}
}