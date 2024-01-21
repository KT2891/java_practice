package practice4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test09 {

	public static void main(String[] args) throws IOException {
		int resultMax = 0;
		int resultMin = 0;
		int n = 0;
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "個目の自然数は？ ");
			n = Integer.parseInt( br.readLine() );
			if (i == 1) {
				resultMax = n;
				resultMin = n;
			}
			if (n > resultMax) {
				resultMax = n;
			} 
			if (n < resultMin) {
				resultMin = n;
			} 
		}
		System.out.println("最大値は" + resultMax);
		System.out.println("最小値は" + resultMin);
	}

}
