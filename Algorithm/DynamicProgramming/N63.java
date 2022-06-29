public class N63 {
    public static void main(String[] args) {
        int[][] obstacleGrid = { { 0, 1 }, { 0, 0 } };
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] ans = new int[m][n];
        int flag = 1;
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                flag = 0;
            }
            ans[i][0] = flag;
        }
        flag = 1;
        for (int j = 0; j < n; j++) {
            if (obstacleGrid[0][j] == 1) {
                flag = 0;
            }
            ans[0][j] = flag;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    ans[i][j] = 0;
                } else {
                    ans[i][j] = ans[i - 1][j] + ans[i][j - 1];
                }
            }
        }
        return ans[m - 1][n - 1];
    }
}
