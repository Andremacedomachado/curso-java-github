package application;

import java.util.Locale;
import java.util.Scanner;

public class ExecicioMatrizLessom72 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int lin = sc.nextInt(), col = sc.nextInt();

		int[][] mat = new int[lin][col];

		for (int i = 0; i < mat.length; i++) {
			for (int y = 0; y < mat[i].length; y++) {
				mat[i][y] = sc.nextInt();
			}
		}

		int match = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int y = 0; y < mat[i].length; y++) {
				if (match == mat[i][y]) {
					System.out.println("Position " + i + "," + y + ":");
					if ((y - 1) >= 0) {
						System.out.println("Left: " + mat[i][y - 1]);
					}
					if ((y + 1) < mat[i].length) {
						System.out.println("Right: " + mat[i][y + 1]);
					}
					if ((i - 1) >= 0) {
						System.out.println("Up: " + mat[i - 1][y]);
					}
					if ((i + 1) < mat.length) {
						System.out.println("Down: " + mat[i + 1][y]);
					}
				}
			}
		}

		sc.close();
	}

}
