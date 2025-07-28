package exceptiontask;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		ArrayList<String> items = new ArrayList<>();

		System.out.print("How many items do you want to add? ");

		int count = scanner.nextInt();

		scanner.nextLine();

		for (int i = 1; i <= count; i++) {

			System.out.print("Enter item " + i + ": ");

			String item = scanner.nextLine();

			items.add(item);
		}

		System.out.println("\nArrayList before removing elements: " + items);

		items.clear();

		System.out.println("ArrayList after removing elements: " + items);

		scanner.close();
	}
}
