public class N566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int row = mat.length;
        int col = mat[0].length;
        if (row * col != r * c) {
            return mat;
        }
        int[][] ans = new int[r][c];
        int r1 = 0, c1 = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans[r1][c1] = mat[i][j];
                c1++;
                if (c1 >= c) {
                    r1++;
                    c1 = 0;
                }
            }
        }
        return ans;
    }
}
