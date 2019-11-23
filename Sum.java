public class Sum {
	public static void main(String[] args) {
		System.out.println("Using While loop: ");
		int i = 1;
		int j = 0;
		while(i<=10) {
			j+=i;
			i++;
		}
		System.out.println(j);
		System.out.println("Using Do While loop: ");
		int k = 1;
		int l = 0;
		do {
			l+=k;
			k++;
		} while(k<=10);
		System.out.println(l);
		System.out.println("Using for loop: ");
		int n = 0;
		for (int m=1;m<=10 ;m++ ) {
			n += m;
		}		System.out.println(n);
	}
}