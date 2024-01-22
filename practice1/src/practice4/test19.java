package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test19 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		int sumResult = 0;
		System.out.println("0を入力するまでに入力した整数の平均を求めます。");
		System.out.print("整数を入力してください： ");
		int n = Integer.parseInt( br.readLine() );
		int i = 0;
		while(n != 0) {
			sumResult += n;
			System.out.print("整数を入力してください： ");
			i ++;
			n = Integer.parseInt( br.readLine() );
		}
		System.out.println("入力値の平均は" + sumResult / i + "です");

	}

}
