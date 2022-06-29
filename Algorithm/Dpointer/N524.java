import java.util.List;

public class N524 {
    public String findLongestWord(String s, List<String> dictionary) {
        String res = "";
        // for (int i = 0; i < dictionary.size(); i++) {
        // if (isSubString(s, dictionary.get(i)) && dictionary.get(i).length() >
        // res.length()) {
        // res = dictionary.get(i);
        // }
        // }
        for (String target : dictionary) {
            int l1 = res.length(), l2 = target.length();
            if (l1 > l2 || (l1 == l2 && res.compareTo(target) < 0)) {
                continue;
            }
            if (isSubString(s, target)) {
                res = target;
            }
        }
        return res;
    }

    public boolean isSubString(String s, String target) {
        int si = 0, ti = 0;
        while (si < s.length() && ti < target.length()) {
            if (s.charAt(si) == target.charAt(ti)) {
                ti++;
            }
            si++;
        }
        return ti == target.length();
    }
}
