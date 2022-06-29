public class N303 {
    private int[] sums;

    public void NumArray(int[] nums) {
        sums = new int[nums.length + 1];
        for (int i = 1; i <= nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }

    }

    public int sumRange(int left, int right) {
        return sums[right + 1] - sums[left];
    }
}
