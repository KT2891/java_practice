package practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test08 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		System.out.println("何曜日ですか？ ");
		System.out.println("0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜");
		int dayOfWeek = Integer.parseInt( br.readLine() );
		System.out.println("どの時間帯ですか？");
		System.out.println("0=午前、1=午後、2=夜間");
		int time = Integer.parseInt( br.readLine());
		switch (dayOfWeek) {
			case 0:
				close();
				break;
			case 1:
				open();
				break;
			case 2:
				if (time == 0) {
					close();
				} else {
					open();
				} break;
			case 3:
				if (time == 2) {
					close();
				} else {
					open();
				} break;
			case 4:
				open();
				break;
			case 5:
				if (time == 0) {
					close();
				} else {
					open();
				} break;
			case 6:
				if (time == 0) {
					open();
				} else {
					close();
				} break;
		}
	}
	
	private static void open() {
		String opened = "診察しています";
		System.out.println(opened);
	}
	
	private static void close() {
		String closed = "休診です";
		System.out.println(closed);
	}

}
