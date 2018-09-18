package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ExercicioBankLesson55 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter account number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("is there na initial deposit (y/n)?  ");
		char choice = sc.next().charAt(0);
		double price = 0.0;
		Account account;
		if (choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			price = sc.nextDouble();
			account = new Account(numberAccount, name, price);
		}
		else{
			account =  new Account(numberAccount, name);
		}
		//account = new Account(numberAccount, name, price, choice);

		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		price = sc.nextDouble();
		account.depositAccount(price);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		price = sc.nextDouble();
		account.withdrawAccount(price);
		System.out.println("Updated account data:");
		System.out.println(account);

		sc.close();
	}

}
