public class N413 {
    public static void main(String[] args) {
        int[] nums = { 1 };
        System.out.println(numberOfArithmeticSlices(nums));
    }

    public static int numberOfArithmeticSlices(int[] nums) {
        int ans = 0;
        int len = nums.length;
        int[] dp = new int[len];
        if (dp.length >= 2) {
            dp[0] = dp[1] = 0;
        }
        for (int i = 2; i < len; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 0;
            }
            ans += dp[i];
        }
        return ans;
    }
}
