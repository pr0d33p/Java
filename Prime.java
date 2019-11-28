import java.util.Scanner;

public class Prime {

	static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
    	int number, count, result;
    	System.out.print("Enter the number you want to check: ");
    	number = reader.nextInt();
    	count = 0;

    	if (number == 0 || number == 1) {
    		System.out.println("Neither Prime nor Composite.");	
    	} else {
    		for (int i = 1; i <= 9 ; i++) {
    			if (number == i) {
    				continue;
    			} else {
    				result = number % i;
    				if (result == 0) {
    					count++;
    				} 
    			}
    			   			
    		}
    		if (count == 1) {
    				System.out.println("Given number is Prime.");	
    			} else {
    				System.out.println("Given number is Consonent.");
    			}
    	}
    }
}
