package practice4;

public class test22 {

	public static void main(String[] args) {
		System.out.println("フィボナッチ数列の表示");
		int i = 0;
		int j = 1;
		int k = 0;
		System.out.println(i);
		System.out.println(j);
		for (;;) {
			k = i + j;
			i = j;
			j = k;
			if (k >= 1000)
				break;
			System.out.println(k);
		}
	}
}