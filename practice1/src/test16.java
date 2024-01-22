import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		
		System.out.print("整数を入力してください？ ");
		int n = Integer.parseInt( br.readLine() );
		int base = n;
		while (n != 1) {
			for (int i = 2; i <= base/2; i++) {
				if ((n % i) == 0) {
					n /= i;
					System.out.print(i + " ");
					break;
				}
			}
			
		}
	}

}
