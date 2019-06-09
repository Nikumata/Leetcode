package BestTimeToBuyAndSellStockI;

public class Solution {

	public static int maxProfit(int[] prices) {
		if (prices.length < 2) return 0;
        int buy = prices[0], sell = prices[1];
        for (int i=1; i<prices.length; i++) {
        	if (prices[i] < buy) buy = prices[i];
        	if (prices[i] > sell) sell = prices[i]; 
        }
        return sell - buy;
    }
	
	public static void main(String[] args) {
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}

}
