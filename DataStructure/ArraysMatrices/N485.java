public class N485 {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null) {
            return 0;
        }
        int LengthOfOne = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                LengthOfOne++;
                ans = Math.max(ans, LengthOfOne);
            } else {
                LengthOfOne = 0;
            }
        }
        return ans;
    }
}
