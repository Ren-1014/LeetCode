public class N230 {
    private int cnt = 0;
    private int val;

    public int kthSmallest(TreeNode root, int k) {
        inOrder(root, k);
        return val;
    }

    private void inOrder(TreeNode node, int k) {
        if (node == null) {
            return;
        }
        inOrder(node.left, k);
        cnt++;
        if (cnt == k) {
            val = node.val;
            return;
        }
        inOrder(node.right, k);
    }
    /*
     * 递归
     * public int kthSmallest(TreeNode root, int k) {
     * int leftCnt = count(root.left);
     * if (leftCnt == k - 1) {
     * return root.val;
     * }
     * if (leftCnt > k - 1) {
     * return kthSmallest(root.left, k);
     * }
     * return kthSmallest(root.right, k - leftCnt - 1);
     * }
     * 
     * private int count(TreeNode node) {
     * if (node == null) {
     * return 0;
     * }
     * return count(node.left) + count(node.right) + 1;
     * }
     */

}
