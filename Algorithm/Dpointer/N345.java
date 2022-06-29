import java.util.Arrays;
import java.util.HashSet;

public class N345 {
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 4 };
        // int i = 0;
        // int res = arr[i++];
        // System.out.println(res);
        int j = 0;
        for (int i = 0; i < 10; i++) {
            j = (j++);
        }
        System.out.println(j);
        // i++ 即后加加，原理是：先自增，然后返回自增之前的值
        // ++i 即前加加，原理是：先自增，然后返回自增之后的值
    }

    private final static HashSet<Character> vowels = new HashSet<>(
            Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

    public String reverseVowels(String s) {
        if (s == null) {
            return null;
        }
        int i = 0, j = s.length() - 1;
        char[] res = new char[s.length()];
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!vowels.contains(ci)) {
                res[i++] = ci;
            } else if (!vowels.contains(cj)) {
                res[j--] = cj;
            } else {
                res[i++] = cj;
                res[j--] = ci;
            }
        }
        return new String(res);
    }
}
