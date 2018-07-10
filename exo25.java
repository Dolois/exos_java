package exos_java;

import java.util.Scanner;

/**
 * 
 * @author Loisel Dominick
 *
 * @version v1.0
 *
 * @paragraph
 * 
 * Write a Java program to compute the specified expressions and print the output.
 *  
 * Test Data :
 * <ul>
 * 	<li>((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))</li>
 * </ul>
 *
 * Expected Output :
 * ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = 2.138888888888889
 * 2.138888888888889
 *
 */

public class exo25 {

	public static void main(String[] args) {
		double a = 25.5;
		double b = 3.5;
		double c = 40.5;
		double d = 4.5;
		double result;
		result = ((a * b - b * b) / (c - d));

		System.out.println("((" + a + " x " + b + " - " + b + " x " + b + ") / (" + c + " - " + d + ")) = " + result);
	    System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
	}
}
