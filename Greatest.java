import java.util.Scanner;

public class Greatest {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int num1, num2, num3;
		System.out.print("Enter the First Number: ");
		num1 = reader.nextInt();
		System.out.print("Enter the Second Number: ");
		num2 = reader.nextInt();
		System.out.print("Enter the Third Number: ");
		num3 = reader.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {

			System.out.println("The greatest number is " + num1);

		} else if (num2 >= num1 && num2 >= num3) {

			System.out.println("The greatest number is " + num2);

		} else if (num3 >= num1 && num3 >= num2) {

			System.out.println("The greatest number is " + num3);

		}
		else {
			System.out.println("Invalid");
		}
	}
}