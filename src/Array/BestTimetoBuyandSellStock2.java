package Array;

public class BestTimetoBuyandSellStock2 {
    public int maxProfit(int[] prices) {
    	if(prices==null||prices.length<=0) return 0;
    	int result = 0;
        int min = prices[0];
        for(int i=0;i<prices.length;i++) {
        	if(min>prices[i]) {
        		min=prices[i];
        	}else {
        		result += prices[i]-min;
        		min = prices[i];
        	}
        }
        return result;
    }
}
