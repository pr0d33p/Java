import java.util.Scanner;

public class VowelOrConsonent {
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		char character;
		System.out.print("Enter Character to check: ");
		character = reader.next().charAt(0);
		char lowercase = Character.toLowerCase(character);
		switch(lowercase) {
			case 'a':
				System.out.println("Vowel"); break;
			case 'e':
				System.out.println("Vowel"); break;
			case 'i':
				System.out.println("Vowel"); break;
			case 'o':
				System.out.println("Vowel"); break;
			case 'u':
				System.out.println("Vowel"); break;
			default:
				System.out.println("Consonent");
		}
	}
}