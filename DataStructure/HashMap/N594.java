import java.util.HashMap;
import java.util.Map;

public class N594 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int n : nums) {
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        }
        int longest = 0;
        for (int k : hm.keySet()) {
            if (hm.containsKey(k + 1)) {
                longest = Math.max(longest, hm.get(k) + hm.get(k + 1));
            }
        }
        return longest;
    }
}
