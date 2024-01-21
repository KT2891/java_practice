package practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test12 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		System.out.println("好きな寿司は？ ");
		System.out.println("1：まぐろ　2：えび　3：こはだ");
		int sushi = Integer.parseInt( br.readLine() );
		switch (sushi) {
			case 1:
				System.out.println("あなたはマグロのような人だ");
				break;
			case 2:
				System.out.println("あなたはエビのような人だ");
				break;
			case 3:
				System.out.println("あなたはこはだのような人だ");
				break;
		}
	}

}
