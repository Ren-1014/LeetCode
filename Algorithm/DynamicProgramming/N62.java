public class N62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(1, 1));
    }

    public static int uniquePaths(int m, int n) {
        if (m == 1 && n == 1) {
            return 1;
        }
        int[][] ans = new int[m + 1][n + 1];
        ans[0][0] = 0;
        for (int i = 1; i < m; i++) {
            ans[i][0] = 1;
        }
        for (int j = 1; j < n; j++) {
            ans[0][j] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                ans[i][j] = ans[i - 1][j] + ans[i][j - 1];
            }
        }
        return ans[m - 1][n - 1];
    }
}
