package Array;

public class BestTimetoBuyandSellStock {
	public int maxProfit(int[] prices) {
		for (int i = 0; i < prices.length - 1; i++) {
			int max = Integer.MIN_VALUE;
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] - prices[i] > max)
					max = prices[j] - prices[i];
			}
			prices[i] = max;
		}
		int max1 = Integer.MIN_VALUE;
		for (int k = 0; k < prices.length - 1; k++) {
			if (prices[k] > max1)
				max1 = prices[k];
		}
		return max1 <= 0 ? 0 : max1;
	}
}
