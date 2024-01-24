package practice6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		System.out.print("1つめの数値を入力；");
		int x = Integer.parseInt( br.readLine() );
		System.out.print("2つめの数値を入力；");
		int y = Integer.parseInt( br.readLine() );
		System.out.print("3つめの数値を入力；");
		int z = Integer.parseInt( br.readLine() );
		int maxNum = 0;
		maxNum = max(x, max(y, z));
		System.out.println("最大値は" + maxNum);
	}
	
	private static int max(int x, int y) {
		int result = 0;
		if (x >= y) {
			result = x;
		} else if (y > x) {
			result = y;
		}
		return result;
	}

}
