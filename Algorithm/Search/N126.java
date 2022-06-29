import java.util.ArrayList;
import java.util.List;

public class N126 {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combinationSum3(int k, int n) {
        if (k <= 0 || k > n) {
            return res;
        }
        dfs(k, n, 0, new ArrayList<>());
        return res;
    }

    private void dfs(int k, int n, int begin, List<Integer> path) {
        if (n == 0 || k == 0) {
            res.add(new ArrayList<>(path));
            return;
        }
        if (n == 0 || k == 0) {
            return;
        }
        for (int i = begin; i < 9; ++i) {
            path.add(i);
            dfs(k - 1, n - i, i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
