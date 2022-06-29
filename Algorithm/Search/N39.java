import java.util.ArrayList;
import java.util.List;

public class N39 {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int len = candidates.length;
        if (len == 0) {
            return res;
        }
        backtracing(candidates, target, 0, new ArrayList<>());
        return res;
    }

    private void backtracing(int[] candidates, int target, int begin, List<Integer> path) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i < candidates.length; ++i) {
            path.add(candidates[i]);
            backtracing(candidates, target - candidates[i], i, path);
            path.remove(path.size() - 1);
        }
    }

}
