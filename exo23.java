package exos_java;

import java.util.Scanner;

/**
 * 
 * @author Dominick
 *
 * @version v1.0
 *
 * @paragraph
 * 
 * Write a Java program to calculate the remainder of division of two numbers and print the results.
 *
 * Test Data :
 * <ul>
 *   <li>Input first number: 125</li>
 *   <li>Input second number: 24</li>
 * </ul>
 * 
 * Expected Output :
 * 125 mod 24 = 5
 * 
 */

public class exo23 {

	public static void main(String[] args) {
		int modulo = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number: ");
		int num1 = in.nextInt();
		System.out.print("Input second number: ");
		int num2 = in.nextInt();
		modulo = (num1 % num2);

		System.out.println(num1 + " mod " + num2 + " = " + modulo);
	}
}
