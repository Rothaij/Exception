package exceptiontask;

import java.util.Scanner;

public class Q3 {
		
		public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);

		try {
			
			System.out.print("Enter your age: ");
			
			int age = scanner.nextInt();

			
			if (age < 18) {
				
				System.out.println("Error: Age must be 18 or above to proceed.");
				
			} else {
				
				System.out.println("Access granted. You are eligible.");
			}

		} catch (Exception e) {
			
			System.out.println("Invalid input! Please enter a valid number.");
			
		} finally {
			scanner.close();
		}
	}
}
