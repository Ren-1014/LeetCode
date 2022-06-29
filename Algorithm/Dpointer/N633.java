public class N633 {
    public boolean judgeSquareSum(int c) {
        int i = 0;
        // for (j = 0; j * j < c; ++j) {
        // if (j * j == c) {
        // return true;
        // }
        // }
        int j = (int) Math.sqrt(c);
        while (i <= j) {
            int sum = i * i + j * j;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
