package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test21 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		System.out.println("入力されたサイズのX印を表示します。");
		System.out.print("数値を入力= ");
		int n = Integer.parseInt( br.readLine() );
		int i, j;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				if (j == i || (i + j) == n - 1 ) {
					System.out.print("X");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
