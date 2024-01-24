package practice5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test08 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new InputStreamReader( System.in ));
		int n[] = new int[10];
		for (int i = 0; i < 10; i++)
			n[i] = Integer.parseInt( br.readLine() );
		
		int baf = 0;
		for (int j = 0; j< 9; j++)
			for(int k = 0; k < 9; k++)
				if (n[k] < n[k + 1]) {
					baf = n[k + 1];
					n[k + 1] = n[k];
					n[k] = baf;
				} 
		for (int data : n)
			System.out.print(data + " ");
	}

}
