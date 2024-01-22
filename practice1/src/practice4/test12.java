package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		int sumResult = 0;
		while ( sumResult < 100) {
			System.out.print("数値を入力： ");
			int n = Integer.parseInt( br.readLine() );
			sumResult += n;
		}
		System.out.println("合計は" + sumResult);
	}

}
