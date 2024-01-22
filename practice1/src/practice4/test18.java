package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test18 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		int sumResult = 0;
		System.out.println("0を入力するまでの合計を求めます。");
		System.out.print("整数を入力してください： ");
		int n = Integer.parseInt( br.readLine() );
		while(n != 0) {
			sumResult += n;
			System.out.print("整数を入力してください： ");
			n = Integer.parseInt( br.readLine() );
		}
		System.out.println("入力値の合計は" + sumResult + "です");
	}

}
