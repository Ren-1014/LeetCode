public class N680 {
    public boolean validPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return isvalid(s, i + 1, j) || isvalid(s, i, j - 1);
            }
        }
        return true;
    }

    private boolean isvalid(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) == s.charAt(j--)) {
                return true;
            }
        }
        return false;
    }

}
