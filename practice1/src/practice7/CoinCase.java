package practice7;

import java.util.HashMap;

public class CoinCase {
	
	private HashMap<Integer, Integer> Coin = new HashMap<Integer, Integer>();
	
	public CoinCase() {
		Coin.put(500, 0);
		Coin.put(100, 0);
		Coin.put(50, 0);
		Coin.put(10, 0);
		Coin.put(5, 0);
		Coin.put(1, 0);
	}
	
	public void AddCoin(int kind, int addCnt) {
		int defCnt = Coin.get(kind);
		defCnt += addCnt;
		Coin.remove(kind);
		Coin.put(kind, defCnt);
	}
	
	public int GetCount(int kind) {
		return Coin.get(kind);
	}
	
	public int GetAmount(int kind) {
		return (Coin.get(kind) * kind);
	}
}
