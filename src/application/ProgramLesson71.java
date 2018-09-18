package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramLesson71 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int negaNumbers = 0, n = sc.nextInt();

		int[][] mat = new int[n][n];

		for (int i = 0; i < mat.length; i++) {
			for (int y = 0; y < mat[i].length; y++) {
				mat[i][y] = sc.nextInt();
			}
		}

		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			for (int y = 0; y < mat[i].length; y++) {
				if (i == y) {
					System.out.print(mat[i][y] + " ");
				}
				if (mat[i][y] < 0) {
					negaNumbers++;
				}
			}
		}
		System.out.println("Negative numbers = "+ negaNumbers);

		sc.close();

	}

}
