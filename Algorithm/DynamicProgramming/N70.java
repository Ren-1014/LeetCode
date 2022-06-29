public class N70 {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int[] k = new int[n + 1];
        for (int i = 0; i < 3 && i <= n; i++) {
            k[i] = i;
        }
        for (int i = 3; i <= n; i++) {
            k[i] = k[i - 1] + k[i - 2];
        }
        return k[n];
    }
}
