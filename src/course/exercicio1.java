package course;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String fullName = sc.nextLine();
		
		System.out.println("how many bedrooms are there in your house?");
		int bedrooms = sc.nextInt();
		
		System.out.println("Enter product price:");
		double price = sc.nextDouble();
		
		System.out.println("Enter your last name, age and height (same line): ");
		String lastName = sc.next();
		double height = sc.nextDouble();
		
		System.out.println("------- OUT DEI ---------");
		System.out.println(fullName);
		System.out.println(bedrooms);
		System.out.println(price);
		System.out.println(lastName);
		System.out.println(height);
		
		
		
		
		
		
		
		
		
		
		sc.close();

	}

}
