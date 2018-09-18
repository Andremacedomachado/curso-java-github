package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeS;

public class ExerciccioEmployeeListLesson69 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<EmployeeS> list = new ArrayList<EmployeeS>();

		System.out.print("How many employees will be registered? ");
		int quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			sc.nextLine();
			System.out.println("Emplooyees #" + i + ":");
			System.out.print("Id: ");
			int id =  sc.nextInt();
			System.out.print("Name: ");
			String name =  sc.nextLine();
			System.out.print("Name: ");
			double salary =  sc.nextDouble();
			list.add(new EmployeeS(id, name, salary));
		}
		
		System.out.print("Enter the employee id that will salary increase: ");
		int field = sc.nextInt();
		
		//EmployeeS emp = list.stream().filter(x -> (x.getId() == field)).findFirst().orElse(null);
		
		
		System.out.print("Enter the percentage: ");
		double porcentage = sc.nextDouble();
		
		
		sc.close();

	}

}
