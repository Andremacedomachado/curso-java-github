package application;

import java.util.Date;
import java.util.Scanner;

import entities.Order;
import entities.enums.OrderStatus;

public class PrograEnumLesson87 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		System.out.print("Enter with order status: ");
		String status = sc.nextLine().toUpperCase();
		Order order = new Order(1080, new Date(), OrderStatus.valueOf(status));
		
		System.out.println(order);
	}

}
