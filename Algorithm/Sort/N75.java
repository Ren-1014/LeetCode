public class N75 {
    public void sortColors(int[] nums) {
        int less = -1, more = nums.length, cur = 0;
        while (cur < more) {
            if (nums[cur] == 0) {
                swap(nums, cur++, ++less);
            } else if (nums[cur] == 2) {
                swap(nums, cur, --more);
            } else {
                cur++;
            }
        }

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
