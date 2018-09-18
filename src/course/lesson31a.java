package course;

import java.util.Scanner;

public class lesson31a {

	/**
	 * @param
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("how many interger numbers are you going to enter? ");
		int length = sc.nextInt();
		int sum = adder(length);
		System.out.println("Sum:     " + sum);

		sc.close();
	}

	public static int adder(int quantum) {
		int result = 0;
		Scanner a = new Scanner(System.in);
		for (int i = 1; i < quantum + 1; i++) {
			System.out.print("Value#" + i + ": ");
			int x = a.nextInt();
			result += x;
		}
		a.close();
		return result;
	}

}
