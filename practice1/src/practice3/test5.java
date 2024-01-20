package practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		System.out.print("値を入力 = ");
		int x = Integer.parseInt( br.readLine() );
		if (x % 2 == 0) {
			System.out.println("入力した値は偶数です");
		} else {
			System.out.println("入力した値は奇数です");
		}
	}

}
