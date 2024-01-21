package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test07 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		String G = "巨人";
		String H = "阪神";
		String winner = "引き分け";
		int gScore = 0;
		int hScore = 0;
		
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		
		for (int i = 1; i <= 9; i++) {
			System.out.print(i + "回表、" + G + "の得点は？" );
			gScore += Integer.parseInt( br.readLine() );
			System.out.print(i + "回裏、" + H + "の得点は？" );
			hScore += Integer.parseInt( br.readLine() );
		}
		
		System.out.println(G + ":" + gScore + "点," + H + ":" + hScore + "点");
		if (gScore > hScore) {
			winner = G;
		} else if (gScore < hScore) {
			winner = H;
		} 
		if (winner == "引き分け") {
			System.out.println(winner);
		} else {
			System.out.println(winner + "の勝ち");
		}
		
	}

}
