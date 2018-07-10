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
 *  Write a Java program that takes two numbers as input and display the product of two numbers.
 *  
 * Test Data :
 * Input first number: 25
 * Input second number: 5
 * 
 * Expected Output :
 * 25 x 5 = 125
 * 
 */

public class exo15 {

	public static void main(String[] args) {
		int multiply = 0;

    	Scanner in = new Scanner(System.in);
    	System.out.print("Input first number: ");
    	int num1 = in.nextInt() ;
    	System.out.print("Input second number: ");
    	int num2 = in.nextInt();
    	multiply = (num1 * num2);

    	System.out.println(num1 + " x " + num2 + " = " + multiply);
	}
}
