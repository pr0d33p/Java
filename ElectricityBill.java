import java.util.Scanner;

public class ElectricityBill {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		int min_charge, units, amount;
		min_charge = 100;
		amount = 0;
		System.out.print("Enter the Units in Bill: ");
		units = reader.nextInt();
		if (units <= 10) {
			amount = min_charge;
			System.out.println("Your Bill amount is Rs. " + amount);
		} else if (units > 11 && units <= 50) {
			units = units - 10;
			amount = min_charge + units * 5;
			System.out.println("Your Bill amount is Rs. " + amount);
		} else if (units > 51 && units <= 200) {
			units = units - 10;
			amount = min_charge;
			units = units - 40;
			amount = amount + 40 * 5 + units * 10;
			System.out.println("Your Bill amount is Rs. " + amount);
		} else if (units > 200 && units <= 500) {
			units = units - 10;
			amount = min_charge;
			units = units - 40;
			amount = amount + 40 * 5;
			units = units - 150;
			amount = amount + 150 * 10 + units * 15;
			System.out.println("Your Bill amount is Rs. " + amount);
		} else if (units > 500) {
			units = units - 10;
			amount = min_charge;
			units = units - 40;
			amount = amount + 40 * 5;
			units = units - 150;
			amount = amount + 150 * 10;
			units = units - 300;
			amount = amount + 300 * 15 + units * 20;
			System.out.println("Your Bill amount is Rs. " + amount);
		}
		else {
			System.out.println("Invalid");
		}
	}
}