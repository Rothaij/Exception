package exceptiontask;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		try {

			System.out.print("Enter the first integer: ");
			int num1 = scanner.nextInt();

			System.out.print("Enter the second integer: ");
			int num2 = scanner.nextInt();

			int result = num1 / num2;
			System.out.println("Result: " + result);

		} catch (ArithmeticException e) {

			System.out.println("Error: Division by zero is not allowed.");
		} catch (Exception e) {

			System.out.println("Error: Invalid input. Please enter integers only.");
		} finally {
			scanner.close();
		}
	}

}
