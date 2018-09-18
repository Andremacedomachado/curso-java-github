package course;

import java.util.Locale;
import java.util.Scanner;

public class lesson30a {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double number = 0;

		while (number >= 0) {
			System.out.println("\n-------- operation -----------");
			System.out.println("Enter a number: ");
			number = sc.nextDouble();
			if (number <= 0) {
				System.out.println("Nagative number");
			} else {
				double result = Math.sqrt(number);
				System.out.println("Result: " + result);
			}
		}
		sc.close();

	}

}
