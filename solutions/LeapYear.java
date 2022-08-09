package com.solution;

import java.util.Scanner;

public class LeapYear {
    
    public static boolean isLeapYear(int year) { 
	
	if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
	    
	     return true; 
	}
	else {
	    return false; 
	}
    }

    public static void main(String[] args) {

	int num; 
	Scanner inp = new Scanner(System.in); 
	num = inp.nextInt();
	inp.close();
	System.out.println(isLeapYear(num));
    }

}
