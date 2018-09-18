package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramLesson44V1 {

	public static final double PI = 3.14159;

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Versao 1

		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = circumference(radius);

		double v = volume(radius);

		System.out.println("Circumference: " + c);
		System.out.println("Volume: " + v);
		System.out.println("PI value: " + PI);
		sc.close();

	}

	public static double circumference(double radius) {

		return 2.0 * PI * radius;
	}

	public static double volume(double radius) {

		return 4.0 * PI * radius * radius * radius / 3.0;
	}
}
