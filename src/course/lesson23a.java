package course;

import java.util.Scanner;

public class lesson23a {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an integer number: ");
		int number = sc.nextInt();
		if((number%2)==0){
			System.out.println("Even!");
		}
		else{
			System.out.println("Odd!");
		}
		
	
		sc.close();
	}

}
