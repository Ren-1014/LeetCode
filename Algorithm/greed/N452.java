import java.util.Arrays;
import java.util.Comparator;

public class N452 {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });

        int n = points.length;
        int right = points[0][1];
        int ans = 1;
        for (int i = 1; i < n; i++) {
            if (points[i][0] > right) {
                ans++;
                right = points[i][1];
            }
        }

        return n - ans;
    }
}
