package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		System.out.print("何回？ ");
		int n = Integer.parseInt( br.readLine() );
		
		for (int i = 0; i < n; i++) {
			if (i >= 10) {
				System.out.print(i - 10);
			} else {
				System.out.print(i);
			}
		} 
	}

}
