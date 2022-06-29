import java.util.ArrayList;
import java.util.List;

public class leetcode {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        dfs(ans, new StringBuilder(), 0, 0, n);
        return ans;
    }

    private void dfs(List<String> ans, StringBuilder cur, int open, int close, int n) {
        if (cur.length() == 2 * n) {
            ans.add(cur.toString());
            return;
        }
        if (open < n) {
            cur.append('(');
            dfs(ans, cur, open + 1, close, n);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (open > close) {
            cur.append(')');
            dfs(ans, cur, open, close + 1, n);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
