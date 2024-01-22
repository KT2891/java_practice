package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test15 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		System.out.print("数値を入力= ");
		int n = Integer.parseInt( br.readLine() );
		int i = 2;
		while (n % i != 0 && i <= n/2) {	
			i ++;
		}
		if ( i > n/2) {
			System.out.println(n + "は素数です。");
		} else {
			System.out.println(n + "は素数ではありません。");
		}
	}
}
