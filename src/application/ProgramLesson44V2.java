package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class ProgramLesson44V2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		// Versao 2
		/*
		 * Calculator calc = new Calculator();
		 * 
		 * System.out.println("Enter radius: "); double radius =
		 * sc.nextDouble();
		 * 
		 * double c = calc.circumference(radius);
		 * 
		 * double v = calc.volume(radius);
		 * 
		 * System.out.println("Circumference: " + c);
		 * System.out.println("Volume: " + v); System.out.println("PI value: " +
		 * calc.PI);
		 */

		// Versao 3


		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		System.out.println("Circumference: " + Calculator.circumference(radius));
		System.out.println("Volume: " + Calculator.volume(radius));
		System.out.println("PI value: " + Calculator.PI);

		sc.close();

	}

}