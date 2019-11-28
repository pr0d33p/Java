import java.util.Scanner;

public class Calculator {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter the first Number: ");
		int num1 = reader.nextInt();
		System.out.print("Enter the second Number: ");
		int num2 = reader.nextInt();
		System.out.println("Which operation you want to perform? \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
		System.out.print(">> ");
		int operation = reader.nextInt();
		switch (operation) {
			case 1:
				int result1 = num1 + num2;
				System.out.println("Result: " + result1);
				break;
			case 2:
				int result2 = num1 - num2;
				System.out.println("Result: " + result2);
				break;
			case 3:
				int result3 = num1 * num2;
				System.out.println("Result: " + result3);
				break;

			case 4:
				double result4 = (double)num1 / (double)num2;
				System.out.println("Result: " + result4);
				break;
			default:
				System.out.println("Invalid Operation Chosen.");
		}
	}
}