public class N605 {
    public static void main(String[] args) {
        int[] flowerbed = { 1, 0, 0, 0, 1 };
        System.out.println(canPlaceFlowers(flowerbed, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int cnt = 1, ans = 0;
        int len = flowerbed.length;
        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) {
                cnt++;
            } else {
                cnt = 0;
            }
            if (cnt == 3) {
                ans++;
                cnt = 1;
            }
        }
        if (cnt == 2) {
            ans++;
        }
        return ans >= n;
    }

}