
import java.util.PriorityQueue;

public class N215 {

    public int findKthLargest(int[] nums, int k) {
        /**
         * Arrays.sort(nums);
         * return nums[nums.length - k];
         */
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int val : nums) {
            pq.add(val);
            if (pq.size() > k) {
                pq.poll(); // 删除头结点（删除尾节点并将尾节点的值替换头节点的值），保留大元素
            }
        }
        return pq.peek();

    }
}
