package practice6;

public class test05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		delta(3, 'A');
		System.out.println();
		delta(4, 'B');
		System.out.println();
		delta(5, 'C');
	}
	private static void delta(int n, char a) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(a);
			System.out.println();
		}
	}

}
