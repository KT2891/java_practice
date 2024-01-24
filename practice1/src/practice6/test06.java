package practice6;

public class test06 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1; i <= 9; i++)
			kuku(i);
	}
	
	private static void kuku(int n) {
		for(int i = 1; i <= 9; i++)
			System.out.printf(" %2d", i * n);
		System.out.println();
	}
}
