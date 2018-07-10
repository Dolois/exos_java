package exos_java;

/**
 * 
 * @author Dominick
 *
 * @version v1.0
 *
 * @paragraph
 * 
 * Write a Java program to print the result of the following operations.
 * 
 * Test Data :
 * -5 + 8 * 6
 * (55 + 9) % 9
 * 20 + -3 * 5 / 8
 * 5 + 15 / 3 * 2 - 8 % 3
 * 
 * Expected Output :
 * 43 
 * 1 
 * 19 
 * 13
 *
 */

public class exo14 {

	public static void main(String[] args) {
		int sum1 = -5 + 8 * 6;
		double sum2 = (55 + 9) % 9;
		double sum3 = (20 + -3 * 5 / 8);
		double sum4 = (5 + 15 / 3 * 2 - 8 % 3);

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}
}
