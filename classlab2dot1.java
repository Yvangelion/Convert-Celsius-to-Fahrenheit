package Lab2dot1;

import java.util.Scanner;

public class classlab2dot1 {

	/* 
	 * Computer Science 1 Spring
	 * 2-1 Convert Celsius to Fahrenheit. 
	 *
	 *This program converts Celsius to Fahrenheit in degrees. First the 
	 *program prompts the user to input the value of Celsius in degrees
	 *which is then converted into Fahrenheit as the output of the program.
	 */
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);  		

		System.out.print("Please enter your tempreture in degrees celsius: ");		

		double celsius = input.nextDouble();

		double fahrenheit = (1.8 * celsius) + 32;

		System.out.println("Calculated Temperature in degrees fahrenheit: "+ fahrenheit);

		input.close(); 

	}

}
