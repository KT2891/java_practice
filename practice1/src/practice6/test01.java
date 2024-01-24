package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test01 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		System.out.print("数値を入力：");
		int n = Integer.parseInt( br.readLine() );
		System.out.println(n + "の2乗は" + square(n));
	}
	
	private static int square(int n) {
		return (n*n);
	}

}
