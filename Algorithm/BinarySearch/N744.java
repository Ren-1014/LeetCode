public class N744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        int l = 0, h = len - 1;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (letters[m] <= target) {
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return l < len ? letters[l] : letters[0];
    }
}
