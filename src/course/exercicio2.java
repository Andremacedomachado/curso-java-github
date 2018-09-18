package course;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter with the numbers: ");
		String original = sc.nextLine().trim();
		int higher = max(original);
		showResult(higher);

		sc.close();

	}
	/* metodo que converte um vetor de string pra vetor de 
	 * inteiros, e acha o maior elemento
	*/
	public static int max(String x) {
		String[] vect = x.split(" ");
		int bigger = 0;
		int[] vectInt = new int[vect.length];
		for (int i = 0; i < vect.length; i++) {
			vectInt[i] = Integer.parseInt(vect[i]);
		}

		for (int i = 0; i < vectInt.length; i++) {
			if (i == 0) {
				bigger = vectInt[0];

			} else if (bigger < vectInt[i]) {
				bigger = vectInt[i];
			}
		}
		return bigger;
	}
	//mostra saida
	public static void showResult(int phrase) {

		System.out.println("Result: " + phrase);
	}
}
