package application;

import java.util.ArrayList;
import java.util.List;

public class ProgramLIistLesson68 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("----------------");
		// list.removeIf( x --> x.charAt(0) == "M");
		/*
		 * for(String x:list){ System.out.println(x); }
		 */
		
		System.out.println("Index of Bob: "+ list.indexOf("Bob"));
		
		System.out.println("----------------");
		
	}

}