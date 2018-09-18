package course;

import java.util.Scanner;

public class exercicio3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter N: ");
		int n = sc.nextInt(), i = 1, x = 0, higher = Integer.MIN_VALUE;
		boolean condicion = true;
		while (condicion) {
			if (n <= 1) {
				System.out.print("N must be positie! Try again: ");
				n = sc.nextInt();
			} else {
				condicion = false;
			}
		}
		while (i < n + 1) {
			System.out.print("Value #" + i + ": ");
			x = sc.nextInt();
			if (higher < x) {
				higher = x;
			}
			i++;
		}

		System.out.println("Higher = " + higher);
		
		sc.close();

	}

}
