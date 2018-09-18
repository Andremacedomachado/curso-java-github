package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ProgramLesson63 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i = 0, n = sc.nextInt();

		Product[] vectProd = new Product[n];
		double sum = 0;
		while (i < vectProd.length) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vectProd[i] = new Product(name, price);
			sum += vectProd[i].getPrice();
			i++;
		}
		double avg = sum / vectProd.length;

		System.out.println("AVERAGE HEIGHT = " + avg);

		sc.close();

	}

}
