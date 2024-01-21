package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test05 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		int sumResult = 0; 
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "回目=? ");
			sumResult += Integer.parseInt(br.readLine());
		}
		System.out.println("平均値は" + sumResult/10);
	}

}
