package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		System.out.print("1つめの数値を入力：");
		int first = Integer.parseInt( br.readLine());
		System.out.print("2つめの数値を入力：");
		int second = Integer.parseInt( br.readLine());
		System.out.println(first + "と" + second + "の平均は" + ave(first, second));
	}
	
	private static int ave(int f, int c) {
		return (f + c) / 2;
	}

}
