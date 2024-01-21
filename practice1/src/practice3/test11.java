package practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test11 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		System.out.println("何月ですか？ ");
		int month = Integer.parseInt( br.readLine() );
		switch (month) {
			case 1:
				month1();
			case 2:
				month2();
			case 3:
				month3();
			case 4:
				month4();
			case 5:
				month5();
			case 6:
			case 7:
				month7();
			case 8:
			case 9:
				month9();
			case 10:
				month10();
			case 11:
				month11();
			case 12:
				month12();
		}
	}
	private static void month1() {
		System.out.println("元日");
		System.out.println("成人の日");
	}
	private static void month2() {
		System.out.println("建国記念の日");
	}
	private static void month3() {
		System.out.println("春分の日");
	}
	private static void month4() {
		System.out.println("昭和の日");
	}
	private static void month5() {
		System.out.println("憲法記念日");
		System.out.println("みどりの日");
		System.out.println("こどもの日");
	}
	private static void month7() {
		System.out.println("海の日");
	}
	private static void month9() {
		System.out.println("敬老の日");
		System.out.println("秋分の日");
	}
	private static void month10() {
		System.out.println("体育の日");
	}
	private static void month11() {
		System.out.println("文化の日");
		System.out.println("勤労感謝の日");
	}
	private static void month12() {
		System.out.println("天皇誕生日");
	}
}
