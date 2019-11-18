public class SimpleInterest {
	public static void main(String[] args) {
		int principle,time,rate, interest;
		principle = 100;
		time = 10;
		rate = 2;
		interest = principle*time*rate/100;
		System.out.println("Interest: " + interest);
	}
}