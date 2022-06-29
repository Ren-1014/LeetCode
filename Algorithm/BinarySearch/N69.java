public class N69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(10));
    }

    public static int mySqrt(int x) {
        if (x <= 1) {
            return x;
        }
        int l = 0, h = x;
        while (l <= h) {
            int m = l + (h - l) / 2;
            int sqrt = x / m;
            if (sqrt == m) {
                return m;
            } else if (m > sqrt) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return h;

    }
}
