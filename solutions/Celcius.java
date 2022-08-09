package com.solution;

import java.util.Scanner;

public class Celcius {

    public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Celcius");
	double cel = input.nextDouble();
	input.close();
	double fah = (cel * 1.8) + 32; // formula 
	System.out.print("Fahrenheit\n"+fah); // temperature in fahrenheit // 

    }

}
