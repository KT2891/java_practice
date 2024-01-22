package practice5;

public class test03 {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5,6,7,8,9,10};
		System.out.print("偶数：");
		for (int i = 0; i <= 9; i++) {
			if (n[i] % 2 == 0)
				System.out.print(n[i] + " ");
		}
		System.out.println();
		System.out.print("奇数：");
		for (int i = 0; i <= 9; i++) {
			if (n[i] % 2 != 0)
				System.out.print(n[i] + " ");
		}
	}
}