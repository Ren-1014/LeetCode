import java.util.ArrayList;
import java.util.List;

public class N77 {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (k > n || k <= 0) {
            return res;
        }
        backtracing(n, k, 1, new ArrayList<>());
        return res;
    }

    private void backtracing(int n, int k, int begin, List<Integer> path) {
        if (path.size() == k) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = begin; i <= n; ++i) {
            path.add(i);
            backtracing(n, k, i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
