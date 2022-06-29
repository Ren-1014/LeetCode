public class N122 {
    public static void main(String[] args) {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        int test = maxProfit(prices);
        System.out.println(test);
    }

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int min = 0;
        int profit = 0;
        for (int i = 1; i < n; i++) {
            if (prices[i] < prices[min]) {
                min = i;
            } else if (prices[i] > prices[min]) {
                profit += prices[i] - prices[min];
                min = i;
            }
        }
        return profit;
    }
}
