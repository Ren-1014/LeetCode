import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class N451 {
    public String frequencySort(String s) {
        Map<Character, Integer> freMap = new HashMap<>();
        for (char c : s.toCharArray()) {
            freMap.put(c, freMap.getOrDefault(c, 0) + 1);
        }

        List<Character>[] buckets = new ArrayList[s.length() + 1];
        for (char c : freMap.keySet()) {
            int frequency = freMap.get(c);
            if (buckets[frequency] == null) {
                buckets[frequency] = new ArrayList<>();
            }
            buckets[frequency].add(c);
        }
        StringBuilder ansL = new StringBuilder();
        for (int i = buckets.length - 1; i >= 0; i--) {
            if (buckets[i] == null) {
                continue;
            }
            for (char c : buckets[i]) {
                for (int j = 0; j < i; j++) {
                    ansL.append(c);
                }
            }
        }
        return ansL.toString();

    }
}
