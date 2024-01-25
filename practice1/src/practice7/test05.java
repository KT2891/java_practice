package practice7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		
		CoinCase case1 = new CoinCase();
		int[] coinKind = { 1, 5, 10, 50, 100, 500};
		int kind = 0;
		int cnt = 0;
		
		for(int i = 0; i <= 3; i++) {
			System.out.print("硬貨の種類:");
			kind = Integer.parseInt( br.readLine() );
			if (kind == 500 || kind == 100 || kind == 50 || kind == 10 || kind == 5 || kind ==1 ) {
				System.out.print("硬貨の枚数:");
				cnt = Integer.parseInt( br.readLine() );
				case1.AddCoin(kind, cnt);
			} else {
				System.out.println("無効な数値です。");
				i --;
			}
		}
			
			
		for(int n : coinKind) {
			System.out.printf("%3d", n );
			System.out.println("円の枚数:" + case1.GetCount(n) + "枚" );
			System.out.printf("%3d", n );
			System.out.println("円の合計:" + case1.GetAmount(n) + "円" );
		}
	}

}
