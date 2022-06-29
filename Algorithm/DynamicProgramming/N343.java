public class N343 {
    public int integerBreak(int n) {
        // int[] dp = new int[n+1];
        // dp[1]=1;
        // for (int i = 2; i <= n; ++i) {
        // for (int j = 1; j <= i - 1; ++j) {
        // dp[i] = Math.max(dp[i - j] * j, (i - j) * j);
        // }
        // }
        // return dp[n];
        if (n < 4) {
            return n - 1;
        }
        int ans = 1;
        if (n % 3 == 0) {
            ans = (int) Math.pow(3, n / 3);
        } else if (n % 3 == 1) {
            ans = (int) Math.pow(3, n / 3 - 1) * 4;
        } else {
            ans = (int) Math.pow(3, n / 3) * 2;
        }
        return ans;
    }
}
