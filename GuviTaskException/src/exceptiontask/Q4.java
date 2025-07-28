package exceptiontask;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the file name to read: ");

		String fileName = scanner.nextLine();

		try {

			File file = new File(fileName);

			Scanner fileReader = new Scanner(file);

			System.out.println("\nFile contents:");

			while (fileReader.hasNextLine()) {

				System.out.println(fileReader.nextLine());
			}

			fileReader.close();

		} catch (FileNotFoundException e) {

			System.out.println("Error: File not found. Please check the file name and try again.");

		} finally {

			scanner.close();
		}
	}
}
