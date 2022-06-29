public class N392 {
    public static boolean isSubsequence(String s, String t) {
        // int index = -1;
        // for (char c : s.toCharArray()) {
        // index = t.indexOf(c, index + 1);
        // if (index == -1) {
        // return false;
        // }
        // }
        // return true;
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }
}
