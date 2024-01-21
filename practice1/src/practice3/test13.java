package practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test13 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		System.out.println("日数を知りたいのは何月ですか？ ");
		int month = Integer.parseInt( br.readLine() );
		switch (month) {
			case 2:
				day28();
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day30();
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day31();
				break;
			default:
				fail();
				break;
		}
		
	}
	
	private static void day28() {
		System.out.println("その月は28日までです。");
	}
	private static void day30() {
		System.out.println("その月は30日までです。");
	}
	private static void day31() {
		System.out.println("その月は31日までです。");
	}
	private static void fail() {
		System.out.println("入力が間違っています。");
	}
}
