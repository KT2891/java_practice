package practice6;

public class test04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		delta(3);
		System.out.println();
		delta(4);
		System.out.println();
		delta(5);
	}
	private static void delta(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("$");
			System.out.println();
		}
	}
}
