// Program: Sum of two number

import java.util.Scanner;

static Scanner reader = new Scanner(System.in);

public class addition {
	public static void main(String[] args) {

		int num1, num2, result; // Variable decleration
		System.out.print("Enter the First Number: ");
		num1 = reader.nextInt();
		num2 = 2;
		result = num1+num2;
		System.out.println("The sum of two number is: " + result);

	}
}