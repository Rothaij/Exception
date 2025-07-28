package exceptiontask;

public class Q2StringException {
	public static void main(String[] args) {

		try {
			String text = "Hello";

			System.out.println("Character at index 10: " + text.charAt(10)); // Invalid index

		} catch (StringIndexOutOfBoundsException e) {

			System.out.println("Error: String index is out of bounds.");
		}
	}
}
