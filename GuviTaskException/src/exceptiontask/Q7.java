package exceptiontask;

import java.util.*;

public class Q7 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		List<String> itemList = new ArrayList<>();

		System.out.print("Enter number of items: ");

		int count = scanner.nextInt();

		scanner.nextLine();

		for (int i = 1; i <= count; i++) {

			System.out.print("Enter item " + i + ": ");

			String item = scanner.nextLine();

			itemList.add(item);
		}

		String[] itemArray = itemList.toArray(new String[0]);

		System.out.println("\nItems in Array:");

		for (String item : itemArray) {

			System.out.println(item);
		}

		scanner.close();

	}

}
