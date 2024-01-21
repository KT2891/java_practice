package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		System.out.print("何回？ ");
		int n = Integer.parseInt( br.readLine() );
		
		for (int i = 1; i <= n; i++) {
			System.out.print("*");
		}
	}
}
