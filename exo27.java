package exos_java;

import java.util.Scanner;


/**
 * 
 * @author Loisel Dominick
 *
 * @version v1.0 *
 * @paragraph
 * 
 * Write a Java program that calculates the average of three predefined numbers.
 *  
 * Test Data :
 * <ul>
 * 	<li>Input number 1 : </li>
 *  <li>Input number 2 : </li>
 *  <li>Input number 3 : </li>
 * </ul>
 *
 * Expected Output :
 * calculate average of three numbers
 *
 */

public class exo27 {

	public static void main(String[] args) {
		double sum = 0;
		int j = 0;
		
		for (int i = 1; i < 4; i++) {
			Scanner in = new Scanner(System.in);
			System.out.print("Input number " + i + " : ");
			double num = in.nextDouble();
			sum = sum + num;
			j++;
		}
		System.out.println(sum / j);
	}
}
