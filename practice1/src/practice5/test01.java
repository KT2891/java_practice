package practice5;

import java.util.Random;

public class test01 {

	public static void main(String[] args) {
		Random rand = new Random();
		int n[] = new int[10];
    for(int i=0; i < 10; i++) {
    	n[i] = rand.nextInt(100) * 2;
    	System.out.println(n[i]);
    }
	}
}
