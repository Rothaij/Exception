package exceptiontask;

import java.util.*;

public class Q6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		TreeMap<Integer, String> employees = new TreeMap<>();

		System.out.print("Enter number of employees: ");

		int count = scanner.nextInt();

		scanner.nextLine();

		for (int i = 1; i <= count; i++) {

			System.out.print("Enter employee ID for employee " + i + ": ");

			int id = scanner.nextInt();

			scanner.nextLine();

			System.out.print("Enter name for employee " + i + ": ");

			String name = scanner.nextLine();

			employees.put(id, name);
		}

		System.out.println("\nEmployee list sorted by ID:");

		for (Map.Entry<Integer, String> entry : employees.entrySet()) {

			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}

		List<String> names = new ArrayList<>(employees.values());

		Collections.sort(names);

		System.out.println("\nEmployee names in alphabetical order:");

		for (String name : names) {

			System.out.println(name);
		}

		scanner.close();

	}
}
