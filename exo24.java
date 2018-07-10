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
 * Write a Java program that takes a number as input and prints its multiplication table upto 10.
 *  
 * Test Data :
 * <ul>
 * 	<li>Input a number : 8</li>
 * </ul>
 *
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 *
 */

public class exo24 {

	public static void main(String[] args) {
		int result;
		Scanner in = new Scanner(System.in);
		System.out.print("Input first number : ");
		int num1 = in.nextInt();

		for (int i = 1; i < 11; i++) {
			result = 0;
			result = num1 * i;
			System.out.println(num1 + " * " + i + " = " + result);
		}
	}
}
