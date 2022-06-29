public class N283 {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[index] = num;
                index++;
            }
        }
        while (index < nums.length) {
            nums[index++] = 0;
        }
        // if (nums == null) {
        // return;
        // }
        // int head = 0, tail = nums.length - 1;

        // while (head < tail) {
        // if (nums[tail] == 0) {
        // tail--;
        // } else if (nums[head] == 0) {
        // for (int j = head; j < tail; j++) {
        // nums[j] = nums[j + 1];
        // }
        // nums[tail] = 0;
        // head++;
        // tail--;
        // }
        // }
    }
}
