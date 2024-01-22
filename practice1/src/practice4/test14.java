package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test14 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		int strike = 0;
		int ball = 0;
		while (strike < 3 && ball < 4) {
			System.out.println("ストライク=1 or ボール=2 or ファウル=3 ？");
			int jadge = Integer.parseInt( br.readLine() );
			switch (jadge) {
				case 1:
					strike ++;
					break;
				case 2:
					ball ++;
					break;
				case 3:
					if (strike < 2)
						strike ++;
					break;
				default:
					System.out.println("選択肢から選んでください");
					break;
			}
		}
		System.out.println(ball + "ボール," + strike + "ストライク");
	}

}
