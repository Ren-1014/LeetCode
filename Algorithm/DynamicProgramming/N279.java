public class N279 {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        int ans = n;
        for (int i = 0; i <= n; i++) {
            dp[i] = i;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n && i - j * j >= 0; j++) {
                dp[i] = Math.min(dp[i - j * j] + 1, dp[i]);
            }
        }
        return dp[ans];
    }
}
