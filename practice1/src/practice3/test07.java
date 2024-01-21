package practice3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test07 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		System.out.print("試験の点数を入力 = ");
		int x = Integer.parseInt( br.readLine() );
		if (x >= 60) {
			System.out.println("合格");
			if (x >= 80) {
				System.out.println("たいへんよくできました。");
				System.out.println("成績は　優");
			} else if (x >= 60) {
				System.out.println("よくできました。");
				if (x >= 70) {
					System.out.println("成績は　良");
				} else {
					System.out.println("成績は　可");
				}
			}
		} else {
			System.out.println("不合格");
			System.out.println("ざんねんでした。");
			System.out.println("成績は　不可");
		}
	}

}
