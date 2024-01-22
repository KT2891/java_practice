package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test20 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		System.out.println("入力されたサイズの三角形を表示します。");
		System.out.print("数値を入力= ");
		int n = Integer.parseInt( br.readLine() );
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("$");
			System.out.println();
		}
	}
}
