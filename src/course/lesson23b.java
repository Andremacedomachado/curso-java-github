package course;

import java.util.Scanner;

public class lesson23b {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what time is it? ");
		int hour = sc.nextInt();
		if(hour<12){
			System.out.println("Good Morning!");
		}
		else if (hour<18){
			System.out.println("Good Afternoon!");
		}
		else {
			System.out.println("Good evening!");
		}
		
		sc.close();

	}

}
