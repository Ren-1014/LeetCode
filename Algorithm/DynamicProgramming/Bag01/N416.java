package Bag01;

public class N416 {
    public boolean canPartition(int[] nums) {
        int sum = sumArray(nums);
        if (sum % 2 == 1) {
            return false;
        }
        int W = sum / 2;
        boolean[] dp = new boolean[nums.length + 1];
        dp[0] = true;
        for (int num : nums) {
            for (int i = W; i >= num; --i) {
                dp[i] = dp[i] || dp[i - num];
            }
        }
        return dp[W];
    }

    private int sumArray(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
