import java.util.Scanner;

public class Factorial {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]){
		int i, fact = 1;
		System.out.print("Enter the number ot find Factorial: ");
		int number = sc.nextInt();
		for(i = 1;i <= number;i++){
			fact = fact * i;
		}

		System.out.println("Factorial of " + number + " is: " + fact);
	}
}