package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test6 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		System.out.print("あなたの年齢は");
		int birthday = Integer.parseInt( br.readLine());
		int birthdayExchange = birthday * 365;
		System.out.println("あなたが生まれてから" + birthdayExchange + "日が経過しました");
	}

}
