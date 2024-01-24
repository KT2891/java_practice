package practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
		
		ArrayList<Integer> num = new ArrayList<>();
		while(true) {
			System.out.print("数値を入力：")	;
			num.add( Integer.parseInt(br.readLine()) );
			int sum = getSum(num);
			if (sum >= 100 || num.size() == 10) {
				break;
			}
		}
		for( int data : num){
			System.out.print(data + " ");
		}
		
	}
	
	private static int getSum(ArrayList<Integer> num) {
		int sum = 0;
		for(int element : num) {
			sum += element;
		}
		return sum;
	}
}