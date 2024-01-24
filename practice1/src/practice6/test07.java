package practice6;

public class test07 {

	public static void main(String[] args) {
		for (int i = 1; i <= 10100; i++) {
			sosuu(i);
		}

	}
	private static void sosuu(int n) {
		if (n <= 3) {
			System.out.print(n + " ");
			return;
		}
		for (int i = 2; i <= n/2; i++) {
			if((n % i) == 0){
				return;
			}
		}
		System.out.print(n + " ");
	}
}
