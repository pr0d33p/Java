public class Square {
	public static void main(String[] args) {
		System.out.println("Using While loop: ");
		int i = 1;
		while(i<=10) {
			System.out.println(i*i);
			i++;
		}
		System.out.println("Using Do While loop: ");
		int j = 1;
		do {
			System.out.println(j*j);
			j++;
		} while(j<=10);

		System.out.println("Using For loop: ");
		for (int k=1;k<=10 ;k++ ) {
			System.out.println(k*k);
		}
	}
}