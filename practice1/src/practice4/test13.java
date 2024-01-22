package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test13 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		int strike = 0;
		int ball = 0;
		while (strike < 3 && ball < 4) {
			System.out.println("ストライク=1 or ボール=2 ？");
			int jadge = Integer.parseInt( br.readLine() );
			if (jadge == 1) {
				strike ++;
			} else if (jadge == 2) {
				ball ++;
			} else {
				System.out.println("1か2を入力してください");
			}
		}
		System.out.println(ball + "ボール," + strike + "ストライク");
	}

}
