import java.util.List;

public class LeetCode {
    public String findLongestWord(String s, List<String> dictionary) {
        String ans = null;
        for (String t : dictionary) {
            if (t.length() > ans.length() && isWord(s, t)) {
                ans = t;
            }
        }
        return ans;
    }

    private boolean isWord(String s, String target) {
        int i = 0, j = 0;
        while (i < s.length() && j < target.length()) {
            if (s.charAt(i) == target.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == target.length();
    }
}
