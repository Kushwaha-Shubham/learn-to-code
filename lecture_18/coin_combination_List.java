package lecture_18;

import java.util.*;

public class coin_combination_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coin = { 2, 3, 5 };
		int amount = 8;
		List<Integer> ll = new ArrayList<>();
		combination(coin, amount, ll, 0);
	}

	public static void combination(int[] coin, int amount, List<Integer> ll, int idx) {
		if (amount == 0) {
			System.out.println(ll);
			//ll.add(coin[i]);
			return;
		}
		for (int i = idx; i < coin.length; i++) {
			if (amount >= coin[i]) {
				ll.add(coin[i]);
				combination(coin, amount - coin[i], ll, i);
				ll.remove(ll.size()-1);
			}
		}
	}
}
