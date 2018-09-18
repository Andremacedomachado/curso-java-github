package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangle x = new Triangle(), y = new Triangle();
		System.out.println("Enter the measures of triangle x: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Enter the measures of triangle y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaY = y.area();
		double areaX = x.area();
		 
		System.out.println("Triangle X area: " + areaX);
		System.out.println("Triangle Y area: " + areaY); 

		sc.close();
	}

	
}
