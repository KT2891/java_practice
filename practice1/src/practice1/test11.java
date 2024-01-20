package practice1;

public class test11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 100;
		for (int i=x; i>=1; i--) {
			int product = x / i;
			int remainder = x % i;
			System.out.println(x + "を" + i + "で割ったときの商は" + product + "で余りは" + remainder + "です");
		}
	}

}
