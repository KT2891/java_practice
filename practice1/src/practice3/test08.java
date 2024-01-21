package practice3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test08 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in ));
		System.out.println("中間テストの点数は?");
		int middle = Integer.parseInt( br.readLine() );
		System.out.println("期末テストの点数は?");
		int end = Integer.parseInt( br.readLine() );
		boolean flag = false;
		if (middle >= 60 && end >= 60) {
			flag = true;
		} else if (middle + end >= 130) {
			flag = true;
		} else if (middle + end >= 100 && ( middle >= 90 || end >= 90)) {
			flag = true;
		}
		
		if (flag) {
			System.out.println("合格");
		} else {
			System.out.println("不合格");
		}
	}
}
