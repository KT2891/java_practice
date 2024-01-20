package practice2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test4 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader br = new BufferedReader(
				new InputStreamReader( System.in));
		System.out.print("xの値は");
		int x = Integer.parseInt( br.readLine());
		System.out.print("yの値は");
		int y = Integer.parseInt( br.readLine());
		System.out.println(x + "と" + y + "の");
		System.out.println("和は" + (x+y));
		System.out.println("差は" + (x-y));
		System.out.println("積は" + (x*y));
		System.out.println("商は" + (x/y) + "余りは" + (x%y));
	}

}
