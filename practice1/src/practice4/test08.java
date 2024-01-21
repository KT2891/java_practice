package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test08 {

	public static void main(String[] args) throws IOException {
		int result = 0;
		int n = 0;
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		
		for (int i = 0; i < 10; i++) {
			System.out.print(i + "個目の自然数は？ ");
			n = Integer.parseInt( br.readLine() );
			if (n > result) {
				result = n;
			} 
		}
		System.out.println("最大値は" + result);
	}

}
