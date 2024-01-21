package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test06 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		int win = 0;
		int lose = 0;
		System.out.println("0 : 負け, 1: 勝ち");
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "回目の結果は?  ");
			int result = Integer.parseInt( br.readLine() );
			switch (result) {
				case 0:
					lose ++;
					break;
				case 1:
					win ++;
					break;
				default:
					System.out.println("0か1を入力してください");
					i --;
					break;
			}
		}
		System.out.println("勝ちの総数は" + win + ", 負けの総数は" + lose);
	}

}
