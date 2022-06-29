package Bag01;

public class N494 {
    public int findTargetSumWays(int[] nums, int target) {
        int sum = getsum(nums);
        if ((target + sum) % 2 == 1) {
            return 0;
        }
        int W = (target + sum) / 2;
        int[] dp = new int[W + 1];
        dp[0] = 1;
        for (int num : nums) {
            for (int i = W; i >= num; i--) {
                dp[i] = dp[i] + dp[i - num];
            }
        }
        return dp[W];
    }

    private int getsum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
