package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramLesson62 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i = 0, n = sc.nextInt();
		double[] vect = new double[n];
		double sum = 0;

		while (i < n) {
			vect[i] = sc.nextDouble();
			sum += vect[i];
			i++;

		}
		double avg= sum/n;
		
		System.out.println("AVERAGE HEIGHT = " + avg);
		sc.close();

	}

}
