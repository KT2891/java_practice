package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test5 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		System.out.print("xの値は");
		int x = Integer.parseInt( br.readLine());
		System.out.print("yの値は");
		int y = Integer.parseInt( br.readLine());
		int ave = (x + y) / 2;
		System.out.print(x + "と" + y + "の平均値は" + ave);
	}

}
