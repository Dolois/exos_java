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
 * Write a Java program to divide two numbers and print the results (without the digits after the comma).
 * 
 * Test Data :
 * <ul>
 *   <li>Input first number: 125 </li>
 *   <li>Input second number: 24 </li>
 * </ul>
 *
 * Expected Output :
 * 125 / 24 = 5
 * 
 */

public class exo22 {

	public static void main(String[] args) {
		int division = 0;
    	Scanner in = new Scanner(System.in);
    	System.out.print("Input first number : ");
    	int num1 = in.nextInt();
    	System.out.print("Input second number : ");
    	int num2 = in.nextInt();
    	division = (num1 / num2);

    	System.out.println(num1 + " / " + num2 + " = " + division);
	}
}
