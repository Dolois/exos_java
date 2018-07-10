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
 * <p><b>Write a Java program to print the sum (addition) of two numbers.</b>
 * 
 * Test Data :
 * <ul>
 *   <li>Input first number: 125</li>
 *   <li>Input second number: 24</li>
 * </ul>
 * 
 * Expected Output :
 * 125 + 24 = 149
 * </p>
 */

public class exo21 {

	public static void main(String[] args) {
		int addition = 0;
    	Scanner in = new Scanner(System.in);
    	System.out.print("Input first number: ");
    	int num1 = in.nextInt();
    	System.out.print("Input second number: ");
    	int num2 = in.nextInt();
    	addition = (num1 + num2) ;

    	System.out.println(num1 + " + " + num2 + " = " + addition);
	}
}
