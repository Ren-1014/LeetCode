public class N240 {
    public boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            // if (target == matrix[i][high] || target == matrix[i][low]) {
            // return true;
            // }
            // if (target > matrix[i][high] || target < matrix[i][low] || low < high) {
            // continue;
            // }
            int low = 0;
            int high = matrix[0].length - 1;
            while (low <= high) {
                int middle = low + (high - low) / 2;
                if (matrix[i][middle] < target) {
                    low = middle + 1;
                } else if (matrix[i][middle] > target) {
                    high = middle - 1;
                } else {
                    return true;
                }
            }
        }

        return false;
    }
}
