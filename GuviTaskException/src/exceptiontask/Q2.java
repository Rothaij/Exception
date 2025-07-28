package exceptiontask;

public class Q2 {

	public static void main(String[] args) {

		try {
			int[] numbers = { 10, 20, 30 };
			System.out.println("Element at index 5: " + numbers[5]); // Invalid index
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Array index is out of bounds.");
		}
	}

}
