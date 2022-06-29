import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int len = nums.length;
        if (len == 0) {
            return res;
        }
        boolean[] hasUsed = new boolean[len];
        List<Integer> path = new ArrayList<>();
        Arrays.sort(nums);
        backtracing(nums, hasUsed, res, path);
        return res;
    }

    private void backtracing(int[] nums, boolean[] hasUsed,
            List<List<Integer>> res, List<Integer> path) {
        if (nums.length == path.size()) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (hasUsed[i]) {
                continue;
            }
            if (i != 0 && nums[i] == nums[i - 1] && !hasUsed[i - 1]) {
                continue;
            }
            hasUsed[i] = true;
            path.add(nums[i]);
            backtracing(nums, hasUsed, res, path);
            path.remove(path.size() - 1);
            hasUsed[i] = false;
        }
    }
}
