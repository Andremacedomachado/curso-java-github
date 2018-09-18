package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Renter;

public class ExercicioRentLesson64 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int i = 0,n,room;
		Renter[] vectRent = new Renter[10];
		String name,email;
		
		System.out.print("How many rooms will be rented? ");
		n = sc.nextInt();
		
		
		while(i<n){
			sc.nextLine();
			System.out.println("");
			System.out.println("RENT #"+ (i+1));
			System.out.print("Name: ");
			name = sc.nextLine();
			System.out.print("Email: ");
			email = sc.nextLine();
			System.out.print("Room: ");
			room = sc.nextInt();
			vectRent[room] = new Renter(name, email, room);
			
			i++;
		}
		System.out.println("Busy rooms:");
		for(int x=0;x<vectRent.length;x++){
			if(vectRent[x] != null){
				System.out.println(vectRent[x]);
			}
		}

	}

}
