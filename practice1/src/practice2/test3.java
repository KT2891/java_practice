package practice2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test3 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in));
		int x = Integer.parseInt( br.readLine());
		int result = 1;
		for (int i=1; i<=3; i++) {
			result *= x;
			System.out.println(x + "の" + i + "乗は" + result);
		}
	}

}
