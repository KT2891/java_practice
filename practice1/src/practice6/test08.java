package practice6;

public class test08 {

	public static void main(String[] args) {
		for(int n = 11; n <= 20; n++)
			System.out.println(Fibonacci(n));

	}
	private static int Fibonacci(int n) {
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			return Fibonacci( n - 2 ) + Fibonacci( n - 1);
		}			
	}
}
