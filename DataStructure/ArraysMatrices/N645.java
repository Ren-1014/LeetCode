import java.util.HashMap;
import java.util.Map;

public class N645 {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 1; i <= nums.length; i++) {
            int count = hm.getOrDefault(i, 0);
            if (count == 2) {
                ans[0] = i;
            } else if (count == 0) {
                ans[1] = i;
            }
        }
        return ans;
    }
}
