package practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test02 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		System.out.print("xの値は");
		int x = Integer.parseInt(br.readLine());
		System.out.print("yの値は");
		int y = Integer.parseInt(br.readLine());
		if (x > y) {
			System.out.println("大きいのは" + x);
		} else if (x < y) {
			System.out.println("大きいのは" + y);
		}
	}

}
