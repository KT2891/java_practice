package practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		int kuku[][] = new int[9][9];
		System.out.print("1つめの数値：");
		int first = Integer.parseInt( br.readLine() );
		System.out.print("2つめの数値：");
		int second = Integer.parseInt( br.readLine() );
		for(int i = 0; i < 9; i++)
			for(int j = 0; j < 9; j++)
				kuku[i][j] = (i + 1)*(j + 1);
		
		System.out.println(first + "✕" + second + "=" + kuku[first - 1][second - 1]);
	}

}
